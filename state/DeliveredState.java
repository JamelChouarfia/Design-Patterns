package state;

/*
 * Written by Jamel Chouarfia
 */

/**
 * A Delivered state that returns certain Strings
 */
public class DeliveredState extends State {
    /**
     * Creates a new state (Delivered) for the package
     * @param pkg The package
     * @param quantity The amount of packages ordered
     */
    DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
    }

    /**
     * Informs he user that their package has arrived
     */
    public String getStatus() {
        return "The " + super.pkg.getName() + " " + super.getVerb("is", "are") + " here for you";
    }

    /**
     * Informs the user that their package has arrived already
     */
    public String getETA() {
        return "The " + super.pkg.getName() + " " + super.getVerb("is", "are") + " here";
    }

    /**
     * Informs the user that their package has arrived already
     */
    public String delay() {
        return "The " + super.pkg.getName() + " " + super.getVerb("has", "have") + " already been delivered";
    }
}