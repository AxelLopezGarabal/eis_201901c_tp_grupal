package gradle.cucumber;


import gradle.cucumber.contenidos.Bomberman;

public class Tablero {
    private Celda[][] celdas;
    private Coordenada coordenadaBomberman;

    Tablero(int ancho, int alto) {
        this.celdas = new Celda[ancho][alto];
        for(int i = 0; i < ancho; i++)
            for(int j = 0; j < alto; j++)
                this.celdas[i][j] = new Celda();
    }

    /*
        Poner bomberman en la esquina superior izquierda
     */
    public void agregarBomberman(Bomberman bomberman) {
        celdas[0][0].agregar(bomberman);
        coordenadaBomberman = new Coordenada(0,0);
        //return coordenadaBomberman;
    }

    /*
        Mueve a bomberman a la derecha
     */
    public void moverALaDerecha(Bomberman bomberman) {
        celdas[0][0].borrar(bomberman);
        celdas[0][0].agregar(bomberman);

    }
}
