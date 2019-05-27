package gradle.cucumber.direcciones;

import gradle.cucumber.Pair;

public class Sur {
    public static Pair mover(Pair coordenada) {
        return new Pair(coordenada.getA(), coordenada.getB()-1);
    }
}
