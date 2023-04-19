package state;

/*
 * Written by Jamel Chouarfia
 */

/**
 * An ordered state that returns certain Strings
 */
public class OrderedState extends State {
    private int days;

    /**
     * Creates a new state (ordered) for the package
     * @param pkg The package
     * @param quantity The amount of packages ordered
     */
    OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
    }

    /**
     * Returns the status of the package
     */
    public String getStatus() {
        return "The " + super.pkg.getName() + " " + super.getVerb("was", "were") + " ordered";
    }

    /**
     * Returns the estimated shipping date of the product
     */
    public String getETA() {
        return "The " + super.pkg.getName() + " will be shipped within " + days + " business days";
    }

    /**
     * Delays the shipping date of the product by two days and informs the user of it
     */
    public String delay() {
        days += 2;
        return "The " + super.pkg.getName() + " experienced a slight delay in manufacturing\nThe " + super.pkg.getName() + " will be shipped within " + days + " business days";
    }
    
}
