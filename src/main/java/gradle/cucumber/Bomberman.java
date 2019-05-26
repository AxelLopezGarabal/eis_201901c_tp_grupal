package gradle.cucumber;

public class Bomberman {
    private boolean estaVivo = true;

    public Bomberman(){

    }

    public void morir() {
        this.estaVivo = !this.estaVivo;
    }

    public boolean estaVivo() {
        return this.estaVivo;
    }
}
