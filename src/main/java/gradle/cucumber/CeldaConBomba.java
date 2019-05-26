package gradle.cucumber;

public class CeldaConBomba extends Celda {
    public CeldaConBomba(Pair coord) {
        super(coord.getA(), coord.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {

    }

    public void explotar(Tablero tablero) {
        tablero.explocion();
    }

    public void detonar(Tablero tablero) {
        tablero.getCeldas()[this.getCoordenada().getA()][this.getCoordenada().getB()] =
                new Celda(this.getCoordenada().getA(), this.getCoordenada().getB());
    }
}
