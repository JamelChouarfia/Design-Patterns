package factory;

import java.util.ArrayList;

public class PlasticColorPuzzle extends Puzzle {
    /**
     * Sets the variables of the parent class Puzzle to what a Plastic Color Puzzle should be
     */
    public PlasticColorPuzzle() {
        super();
        super.name = "Animal Puzzle by Fisher Price";
        super.material = "plastic";

        super.pieces = new ArrayList<String>();
        super.pieces.add("Green Dog");
        super.pieces.add("Orange Dog");
        super.pieces.add("Red Dog");
        super.pieces.add("Blue Dog");
        super.pieces.add("Yellow Dog");
        super.pieces.add("Brown Dog");
    }
}
