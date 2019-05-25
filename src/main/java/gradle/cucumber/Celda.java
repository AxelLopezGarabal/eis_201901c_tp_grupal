package gradle.cucumber;

import gradle.cucumber.contenidos.Bomberman;
import gradle.cucumber.contenidos.Contenido;
import gradle.cucumber.contenidos.ContenidoVacio;
import gradle.cucumber.contenidos.Personaje;

public class Celda {
    /*
      Por defecto, cuando una celda se crea se hace sin contenido
     */
    private Contenido contenido;

    public Celda() {
        this.contenido = new ContenidoVacio();
    }

    public Celda(Contenido contenido) {
        this.contenido = contenido;
    }

    /*
        Se pueden agregar personajes o paredes
     */
    public void agregar(Personaje p) {
        contenido = p;
    }

    public void borrar(Bomberman bomberman) {
        contenido = new ContenidoVacio();
    }
}
