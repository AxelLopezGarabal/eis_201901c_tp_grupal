package gradle.cucumber.direcciones;

import gradle.cucumber.Pair;

public class Izquierda {

    public static Pair mover(Pair playerCoord) {
        return new Pair(playerCoord.getA() - 1, playerCoord.getB());
    }
}
