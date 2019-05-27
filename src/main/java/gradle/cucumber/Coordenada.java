package gradle.cucumber;

import javafx.util.Pair;

public class Coordenada {

    private Pair<Integer, Integer> coord;

    public Coordenada(int x, int y){
        coord = new Pair<>(x, y);
    }
}
