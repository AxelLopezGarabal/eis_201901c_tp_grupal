package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.contenidos.Bomberman;


public class BombermanStepdefs {

    private Tablero tablero;
    private Bomberman bomberman;
    private Coordenada coordenadaInicial;

    @Given("^un tablero de (\\d+) x (\\d+)$")
    public void tableroVacioDeTamanio(int arg1, int arg2) {
         tablero = new Tablero(arg1, arg2);
    }

    @And("^bomberman en una coordenada valida$")
    public void bomberman_en_una_coordenada_valida() {
        bomberman = new Bomberman();
        //TODO: terminar esto coordenadaInicial = tablero.agregarBomberman(bomberman);
        tablero.agregarBomberman(bomberman);
    }

    @When("^se mueve a la derecha$")
    public void se_mueve_a_la_derecha() {
        tablero.moverALaDerecha(bomberman);
    }

    @Then("^bomberman cambio su coordenada$")
    public void bomberman_cambio_su_coordenada() {
        throw new PendingException();
    }
}
