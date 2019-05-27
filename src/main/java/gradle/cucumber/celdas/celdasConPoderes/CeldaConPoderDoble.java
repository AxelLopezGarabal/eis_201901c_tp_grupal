package gradle.cucumber.celdas.celdasConPoderes;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;

public class CeldaConPoderDoble extends CeldaConPoder {

    public CeldaConPoderDoble(Pair coordenada) {
        super(coordenada);
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.agregarPoderDoble();
        tablero.setPlayerCoord(tablero.playerCoord());
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {

    }
}
