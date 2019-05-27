package gradle.cucumber.celdas;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;

public class Celda {
    private Pair coordenada;

    public Celda(int x, int y){
        this.coordenada = new Pair(x, y);
    }

    public Pair getCoordenada() {
        return this.coordenada;
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.setPlayerCoord(coordenada);
    }

    public void explotar(Tablero tablero) {

    }

    public void detonar(Tablero tablero) {
    }
}
