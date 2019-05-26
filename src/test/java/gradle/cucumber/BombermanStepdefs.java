package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

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

    @Given("^un bomberman que suelta una bomba en la posicion actual")
    public void un_bomberman_que_suelta_una_bomba_en_la_posicion_actual(){
        this.tablero.bombermanSueltaBomba();
    }

    @Given("^un enemigo al norte de la posicion del bomberman")
    public void un_enemigo_al_norte_de_la_posicion_del_bomberman(){
        tablero.ubicarEnemigoEnCelda(new Pair(1,3));
    }

    @Given("^una pared de acero al este de la posicion de bomberman")
    public void una_pared_de_acero_al_este_de_la_posicion_de_bomberman(){
        tablero.ubicarParedDeAceroEnCelda(new Pair(2, 1));
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

    @When("^luego de unos ticks la bomba explota")
    public void luego_de_unos_ticks_la_bomba_explota(){
        tablero.explotarBomba();
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

    @Then("^rompe la pared")
    public void rompe_la_pared(){
        tablero.moverAlNorteBomberman();
        assertEquals(1, tablero.playerCoord().getA());
        assertEquals(2, tablero.playerCoord().getB());
    }

    @Then("^la bomba mato al enemigo")
    public void la_bomba_mato_al_enemigo(){
        tablero.moverAlNorteBomberman();
        assertTrue(this.bomberman.estaVivo());
    }

    @Then("^la pared de acero no se rompio")
    public void la_pared_de_acero_no_se_rompio(){
        tablero.moverALaDerechaBomberman();
        assertEquals(1, tablero.playerCoord().getA());
        assertEquals(1, tablero.playerCoord().getB());
    }
}
