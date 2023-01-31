package factory;

import java.util.ArrayList;

public class PlasticAnimalPuzzle extends Puzzle {
    /**
     * Sets the variables of the parent class Puzzle to what a Plastic Animal Puzzle should be
     */
    public PlasticAnimalPuzzle() {
        super();
        super.name = "Animal Puzzle by Fisher Price";
        super.material = "plastic";

        super.pieces = new ArrayList<String>();
        super.pieces.add("Fox");
        super.pieces.add("Elephant");
        super.pieces.add("Giraffe");
        super.pieces.add("Owl");
        super.pieces.add("Monkey");
    }
}
