package gradle.cucumber;


public class Tablero extends Throwable {

    private Pair playerCoord;
    private Bomberman bomberman;
    private Celda[][] celdas;
    private Celda celdaConBomba;


    public Tablero(int arg1, int arg2) {
        this.celdas = new Celda[arg1][arg2];
        this.crearTodasLasCeldas(arg1, arg2);
    }

    private void crearTodasLasCeldas(int length, int heigth) {
        for(int n = 0; n < length; n++){
            for(int m = 0; m < heigth; m++){
                celdas[n][m] = new Celda(n, m);
            }
        }
    }

    public void ubicarEnCoordenadaInicial(Bomberman bomberman) {
        this.playerCoord = new Pair(1,1);
        this.bomberman = bomberman;
    }

    public void moverALaIzquierdaBomberman() {
        Pair coordenada = Izquierda.mover(this.playerCoord);
        celdas[coordenada.getA()][coordenada.getB()].colocarBomberman(this, coordenada);
    }

    public Pair playerCoord() {
        return this.playerCoord;
    }

    public void ubicarEnemigoEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] =  new CeldaConEnemigo(coordenada);
    }

    public void moverALaDerechaBomberman() {
        Pair coordenada = Derecha.mover(this.playerCoord);
        celdas[coordenada.getA()][coordenada.getB()].colocarBomberman(this, coordenada);
    }

    public void ubicarParedEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] = new CeldaConPared(coordenada);
    }

    public void moverAlNorteBomberman() {
        Pair coordenada = Norte.mover(this.playerCoord);
        celdas[coordenada.getA()][coordenada.getB()].colocarBomberman(this, coordenada);
    }

    public void setPlayerCoord(Pair coordenada) {
        this.playerCoord = coordenada;
    }

    public void colisionaBombermanConEnemigo() {
        this.bomberman.morir();
    }

    public Bomberman getBomberman() {
        return bomberman;
    }

    public void bombermanSueltaBomba() {
        celdas[this.playerCoord.getA()][this.playerCoord.getB()] = new CeldaConBomba(this.playerCoord);
        this.celdaConBomba = celdas[this.playerCoord.getA()][this.playerCoord.getB()];
    }

    public void explotarBomba() {
        this.celdaConBomba.explotar(this);
    }

    public void explosion() {
        this.detonar3AlNorte();
        this.detonar3AlSur();
        this.detonar3ALaIzquierda();
        this.detonar3ALaDerecha();
    }

    private void detonar3ALaDerecha() {
        Pair coord = Derecha.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Derecha.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Derecha.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);
    }

    private void detonar3ALaIzquierda() {
        Pair coord = Izquierda.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Izquierda.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Izquierda.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);
    }

    private void detonar3AlSur() {
        Pair coord = Sur.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Sur.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Sur.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);
    }

    private void detonar3AlNorte() {
        Pair coord = Norte.mover(this.celdaConBomba.getCoordenada());
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Norte.mover(coord);
        celdas[coord.getA()][coord.getB()].detonar(this);

        coord = Norte.mover(coord);
        celdas[coord.getA()][coord.getB()].detonar(this);
    }

    public Celda[][] getCeldas() {
        return this.celdas;
    }

    public void ubicarParedDeAceroEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] = new CeldaConParedDeAcero(coordenada);
    }

    /*
        enemigos
     */

    public void ubicarBagulaaEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] =  new CeldaConBagulaa(coordenada);
    }

    public void ubicarProtoMaxJrEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] =  new CeldaConProtoMaxJr(coordenada);
    }

    public void ubicarProtoMaxunitsEnCelda(Pair coordenada) {
        celdas[coordenada.getA()][coordenada.getB()] =  new CeldaConProtoMaxUnits(coordenada);
    }

    public void moverAlSurBomberman() {
        Pair coordenada = Sur.mover(this.playerCoord);
        celdas[coordenada.getA()][coordenada.getB()].colocarBomberman(this, coordenada);
    }


    /*
        poderes
     */
    public void agregarPoderaBomberman() {
        this.bomberman.agregarPoderLanzarBombas();
    }

    public void agregarPoderSaltarParedesaBomberman() {
        this.bomberman.agregarPoderSaltarParedes();
    }


    public void agregarPoderDoble() {
        this.bomberman.agregarPoderSaltarParedes();
        this.bomberman.agregarPoderLanzarVariasBombasAlMismoTiempo();
    }
}
