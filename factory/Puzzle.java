package factory;

import java.util.ArrayList;

public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;

    /**
     * Returns text describing the toy and its pieces
     */
    public String assemble() {
        String assembledToy = "Putting together the "+name+"\nThis puzzle is made out of "+material+"\nAdding the following pieces\n";

        while (!pieces.isEmpty()) {
            assembledToy = assembledToy + "- " + pieces.remove(0) + "\n";
        }

        return assembledToy;
    }
    
    /**
     * Returns text describing the puzzle being boxed
     */
    public String boxPuzzle() {
        return "Putting the "+name+" in a box";
    }
}