package factory;

public abstract class ToyStore extends Puzzle {
    /**
     * Creates a new puzzle and returns all of the text describing what the toy is and it being prepared
     * @param type The type of puzzle, which gets pushed to the createPuzzle method
     * @return Text describing the assembly of the puzzle and boxing them
     */
    public String orderPuzzle(String type) {
        Puzzle newPuzzle = this.createPuzzle(type);
        return newPuzzle.assemble() + newPuzzle.boxPuzzle();
    }

    /**
     * Forces the children Toy Stores to have a createPuzzle method
     * @param type The type, not material of the puzzle being made
     * @return The puzzle that was created
     */
    public abstract Puzzle createPuzzle(String type);
}