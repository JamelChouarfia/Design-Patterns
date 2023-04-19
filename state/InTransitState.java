package state;

/*
 * Written by Jamel Chouarfia
 */

/**
 * An InTransit state that returns certain Strings
 */
public class InTransitState extends State {
    private int days;

    /**
     * Creates a new state (InTransit) for the package
     * @param pkg The package
     * @param quantity The amount of packages ordered
     */
    InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
    }

    /**
     * Returns the status of the package
     */
    public String getStatus() {
        return "The " + super.pkg.getName() + " " + super.getVerb("is", "are") + " out for delivery";
    }

    /**
     * Returns the estimated arrival date of the product
     */
    public String getETA() {
        return "The " + super.pkg.getName() + " should arrive within " + days + " days";
    }

    /**
     * Delays the delivery date of the product by three days and informs the user of it
     */
    public String delay() {
        days += 3;
        return "The " + super.pkg.getName() + " " + super.getVerb("has", "have") + " experienced a delay in shipping.\nThe " + super.pkg.getName() + " should arrive within " + days + " days";
    }
}
