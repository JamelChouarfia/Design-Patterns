package factory;

public class MelissaAndDougStore extends ToyStore {
    /**
     * Creates a wooden puzzle based on the string type
     * @param type If type equals "color", it returns a color puzzle. If type equals "animal", then it returns an animal puzzle. If it's neither, then it returns nothing.
     */
    public Puzzle createPuzzle(String type) {
        if (type.equals("color")) {
            return new WoodColorPuzzle();
        } else if (type.equals("animal")) {
            return new WoodAnimalPuzzle();
        } else {
            return null;
        }
    }
}