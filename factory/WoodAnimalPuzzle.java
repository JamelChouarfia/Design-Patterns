package factory;

import java.util.ArrayList;

public class WoodAnimalPuzzle extends Puzzle {
    /**
     * Sets the variables of the parent class Puzzle to what a Wood Animal Puzzle should be
     */
    public WoodAnimalPuzzle() {
        super();
        super.name = "Animal Puzzle by Melissa and Doug";
        super.material = "wood";
        
        super.pieces = new ArrayList<String>();
        super.pieces.add("Horse");
        super.pieces.add("Sheep");
        super.pieces.add("Dog");
        super.pieces.add("Cat");
        super.pieces.add("Cow");
        super.pieces.add("Chicken");
    }
}
