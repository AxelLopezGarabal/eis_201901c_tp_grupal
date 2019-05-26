package gradle.cucumber;

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
