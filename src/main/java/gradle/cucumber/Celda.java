package gradle.cucumber;

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

    public boolean esCeldaEnemiga() {
        return false;
    }
}
