package decorator;

public class Chocolate extends ScoopDecorator {
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
    }
}
