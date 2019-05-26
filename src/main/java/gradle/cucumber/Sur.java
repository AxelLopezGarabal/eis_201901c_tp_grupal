package gradle.cucumber;

public class Sur {
    public static Pair mover(Pair coordenada) {
        return new Pair(coordenada.getA(), coordenada.getB()-1);
    }
}
