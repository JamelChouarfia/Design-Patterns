package decorator;

public abstract class IceCream {
    protected String description;

    /**
     * Returns the contents of the Ice Cream
     */
    public String toString() {
        return description;
    }

    /**
     * Forces all the classes extending this class to have a getCost function
     */
    public double getCost() {
        return 2;
    }
    
}