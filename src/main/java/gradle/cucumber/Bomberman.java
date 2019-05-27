package gradle.cucumber;

public class Bomberman {
    private boolean estaVivo = true;
    private boolean tienePoderLanzarBombas = false;
    private boolean tienePoderSaltarParedes = false;
    private boolean tienePoderLanzarVariasBombasAlMismoTiempo = false;


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


    public boolean tienePoderSaltarParedes() {
        return this.tienePoderSaltarParedes;
    }

    public void agregarPoderSaltarParedes() {
        this.tienePoderSaltarParedes = true;
    }

    public boolean tienePoderLanzarVariasBombasAlMismoTiempo() {
        return this.tienePoderLanzarVariasBombasAlMismoTiempo;
    }

    public void agregarPoderLanzarVariasBombasAlMismoTiempo() {
        this.tienePoderLanzarVariasBombasAlMismoTiempo = true;
    }
}
