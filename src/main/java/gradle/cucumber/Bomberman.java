package gradle.cucumber;

public class Bomberman {
    private boolean estaVivo = true;
    private boolean tienePoderLanzarBombas = false;

    public Bomberman(){

    }

    public void morir() {
        this.estaVivo = !this.estaVivo;
    }

    public boolean estaVivo() {
        return this.estaVivo;
    }

    public boolean tienePoderLanzarBombas() {
        return this.tienePoderLanzarBombas;
    }

    public void agregarPoderLanzarBombas() {
        this.tienePoderLanzarBombas = true;
    }
}
