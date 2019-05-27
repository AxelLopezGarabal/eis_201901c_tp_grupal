package gradle.cucumber.celdas.celdasConPoderes;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;
import gradle.cucumber.celdas.Celda;

public class CeldaConPoder extends Celda {

    public CeldaConPoder(Pair coordenada) {
        super(coordenada.getA(), coordenada.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.agregarPoderaBomberman();
        tablero.setPlayerCoord(tablero.playerCoord());
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {

    }
}
