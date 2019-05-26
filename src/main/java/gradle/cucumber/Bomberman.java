package gradle.cucumber;

public class Bomberman {
    private boolean estamuerto = true;

    public Bomberman(){

    }

    public void morir() {
        this.estamuerto = !this.estamuerto;
    }

    public boolean estaVivo() {
        return this.estamuerto;
    }
}
