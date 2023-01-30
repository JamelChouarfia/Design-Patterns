package decorator;

public class Chocolate extends ScoopDecorator {
    /**
     * Adds Scoops to the Ice Cream, which is iceCream
     * @param iceCream The Ice Cream that the scoops are being added to
     * @param numScoops The amount of scoops
     */
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }
}
