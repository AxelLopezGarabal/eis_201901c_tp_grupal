package gradle.cucumber.direcciones;

import gradle.cucumber.Pair;

public class Norte {
    public static Pair mover(Pair coordenada) {
        return new Pair(coordenada.getA(), coordenada.getB()+1);
    }
}
