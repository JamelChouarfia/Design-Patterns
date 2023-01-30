package decorator;

public class Strawberry extends ScoopDecorator {
    /**
     * Adds Scoops to the Ice Cream, which is iceCream
     * @param iceCream The Ice Cream that the scoops are being added to
     * @param numScoops The amount of scoops
     */   
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }
}
