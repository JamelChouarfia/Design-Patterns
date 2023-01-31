package factory;

public class FisherPriceStore extends ToyStore {
    /**
     * Creates a plastic puzzle based on the string type
     * @param type If type equals "color", it returns a color puzzle. If type equals "animal", then it returns an animal puzzle. If it's neither, then it returns nothing.
     */
    public Puzzle createPuzzle(String type) {
        if (type.equals("color")) {
            return new PlasticColorPuzzle();
        } else if (type.equals("animal")) {
            return new PlasticAnimalPuzzle();
        } else {
            return null;
        }
    }
}