package gradle.cucumber;

public class CeldaConEnemigo extends Celda {
    public CeldaConEnemigo(Pair coordenada) {
        super(coordenada.getA(), coordenada.getB());
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.colicionaBombermanConEnemigo();
        tablero.setPlayerCoord(coordenada);
    }

    public boolean esCeldaEnemiga() {
        return true;
    }
}
