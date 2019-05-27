package gradle.cucumber.celdas.celdasConEnemigos;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;
import gradle.cucumber.celdas.celdasConPoderes.CeldaConPoder;

public class CeldaConBagulaa extends CeldaConEnemigo {

    public CeldaConBagulaa(Pair coordenada) {
        super(coordenada);
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.colisionaBombermanConEnemigo();
        tablero.setPlayerCoord(coordenada);
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {
        tablero.getCeldas()[this.getCoordenada().getA()][this.getCoordenada().getB()] = new CeldaConPoder(this.getCoordenada());
    }
}
