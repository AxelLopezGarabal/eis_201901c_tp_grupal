package gradle.cucumber;

public class Norte {
    public static Pair mover(Pair coordenada) {
        return new Pair(coordenada.getA(), coordenada.getB()+1);
    }
}
