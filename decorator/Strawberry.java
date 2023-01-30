package decorator;

public class Strawberry extends ScoopDecorator {
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }
}
