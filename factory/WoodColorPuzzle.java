package factory;

import java.util.ArrayList;

public class WoodColorPuzzle extends Puzzle {
    /**
     * Sets the variables of the parent class Puzzle to what a Wood Color Puzzle should be
     */
    public WoodColorPuzzle() {
        super();
        super.name = "Animal Puzzle by Melissa and Doug";
        super.material = "wood";

        super.pieces = new ArrayList<String>();
        super.pieces.add("Red Fish");
        super.pieces.add("Yellow Fish");
        super.pieces.add("Green Fish");
        super.pieces.add("Purple Fish");
        super.pieces.add("Pink Fish");
        super.pieces.add("Orange Fish");
        super.pieces.add("Brown Fish");
        super.pieces.add("White Fish");
        super.pieces.add("Black Fish");
    }
}
