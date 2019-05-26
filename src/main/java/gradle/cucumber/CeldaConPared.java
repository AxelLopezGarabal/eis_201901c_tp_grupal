package gradle.cucumber;

public class CeldaConPared extends Celda {
    public CeldaConPared(Pair coordenada) {
        super(coordenada.getA(), coordenada.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.setPlayerCoord(tablero.playerCoord());
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {
        tablero.getCeldas()[this.getCoordenada().getA()][this.getCoordenada().getB()] =
                new Celda(this.getCoordenada().getA(), this.getCoordenada().getB());
    }
}
