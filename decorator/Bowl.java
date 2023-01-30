package decorator;

public class Bowl extends IceCream {
    /**
     * Sets the Ice Cream's description to "Bowl"
     */
    public Bowl() {
        super.description = "Bowl";
    }

    /**
     * Returns 0 because the bowl is free
     */
    public double getCost() {
        return 0;
    }
}
