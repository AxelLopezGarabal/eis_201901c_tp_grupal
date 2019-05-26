package gradle.cucumber;

public class CeldaConParedDeAcero extends Celda {
    public CeldaConParedDeAcero(Pair coordenada) {
        super(coordenada.getA(), coordenada.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.setPlayerCoord(tablero.playerCoord());
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {

    }
}
