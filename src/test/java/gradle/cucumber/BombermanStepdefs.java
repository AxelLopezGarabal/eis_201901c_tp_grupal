package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombermanStepdefs {

    Tablero tablero;
    Bomberman bomberman;

    @Given("^un tablero de (\\d+) x (\\d+)$")
    public void un_tablero_de_x(int arg1, int arg2) {
        tablero = new Tablero(arg1, arg2);
    }

    @Given("^bomberman en una coordenada valida$")
    public void bomberman_en_una_coordenado_valida() {
        bomberman = new Bomberman();
        tablero.ubicarEnCoordenadaInicial(bomberman);
    }

    @Given("^un enemigo en una coordenada valida")
    public void un_enemigo_en_una_coordenada_valida(){
        tablero.ubicarEnemigoEnCelda(new Pair(2,1));
    }

    @Given("^una pared al norte de la posicion de bomberman")
    public void una_pared_al_norte_de_la_posicion_de_bomberman(){
        tablero.ubicarParedEnCelda(new Pair(1,2));
    }

    @When("^se mueve a la izquierda$")
    public void se_mueve_a_la_izquierda() {
        tablero.moverALaIzquierdaBomberman();
    }

    @When("^bomberman se mueve a la derecha")
    public void bomberman_se_mueve_a_la_derecha(){
        tablero.moverALaDerechaBomberman();
    }

    @When("^bomberman se mueve al norte")
    public void bomberman_se_mueve_al_norte(){
        tablero.moverAlNorteBomberman();
    }

    @Then("^bomberman cambio su coordenada")
    public void bomberman_cambio_su_coordenada() {
        assertEquals(0, tablero.playerCoord().getA());
        assertEquals(1, tablero.playerCoord().getB());
    }

    @Then("^bomberman muere")
    public void bomberman_muere(){
        assertFalse(bomberman.estaVivo());
    }

    @Then("^bomberman no cambia su coordenada")
    public void bomberman_no_cambia_su_coordenada(){
        assertEquals(1, tablero.playerCoord().getA());
        assertEquals(1, tablero.playerCoord().getB());
    }
}
