package decorator;

public abstract class ScoopDecorator extends IceCream{
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;
    protected boolean hasBeenAdded;

    /**
     * Sets up an Ice Cream that has the new scoop(s) in it
     * @param iceCream Contents from the Ice Cream bowl/cone being used for the new scoop
     * @param numScoops The amount of scoops of a specific flavor
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
        hasBeenAdded = false;

        if (this.getClass() == Vanilla.class) {
            flavor = "vanilla";
            flavorCost = 1.25;
        } else if (this.getClass() == Chocolate.class) {
            flavor = "chocolate";
            flavorCost = 1.5;
        } else {
            flavor = "strawberry";
            flavorCost = 1.4;
        }

        super.description = toString();

        // hasBeenAdded prevents the Ice Cream from "adding" new scoops when toString is called outside the constructor
        hasBeenAdded = true;
    }

    /**
     * Returns the contents of the Ice Cream and, if needed, updates them
     */
    public String toString() {
        if (hasBeenAdded) {
            if (numScoops == 1) {
                iceCream.description = iceCream.description + ", a scoop of "+flavor+" ice cream";
                return iceCream.description;
            } else {
                iceCream.description = iceCream.description + ", "+numScoops+" scoops of "+flavor+" ice cream";;
                return iceCream.description;
            }
        } else {
            return iceCream.description;
        }
    }
    
    /**
     * Returns the cost by adding iceCream's cost with the cost of the new scoops
     */
    public double getCost() {
        return iceCream.getCost() + (numScoops * flavorCost);
    }
}