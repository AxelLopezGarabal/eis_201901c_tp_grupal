package gradle.cucumber.celdas.celdasConContenido;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;
import gradle.cucumber.celdas.Celda;

public class CeldaConBomba extends Celda {
    public CeldaConBomba(Pair coord) {
        super(coord.getA(), coord.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {

    }

    public void explotar(Tablero tablero) {
        tablero.explosion();
    }

    public void detonar(Tablero tablero) {
        tablero.getCeldas()[this.getCoordenada().getA()][this.getCoordenada().getB()] =
                new Celda(this.getCoordenada().getA(), this.getCoordenada().getB());
    }
}
