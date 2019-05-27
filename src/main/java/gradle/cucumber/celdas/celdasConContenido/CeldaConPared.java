package gradle.cucumber.celdas.celdasConContenido;

import gradle.cucumber.Pair;
import gradle.cucumber.Tablero;
import gradle.cucumber.celdas.Celda;

public class CeldaConPared extends Celda {
    public CeldaConPared(Pair coordenada) {
        super(coordenada.getA(), coordenada.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.moverBombermanEnTablero(coordenada);
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {
        tablero.getCeldas()[this.getCoordenada().getA()][this.getCoordenada().getB()] =
                new Celda(this.getCoordenada().getA(), this.getCoordenada().getB());
    }
}
