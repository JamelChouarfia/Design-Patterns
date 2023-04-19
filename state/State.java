package state;

/*
 * Written by Jamel Chouarfia
 */

/**
 * An abstract class that is used for the different possible states
 */
public abstract class State {
    protected Package pkg;
    protected int quantity;

    /**
     * Creates a new base state class
     * @param pkg The package being tracked
     * @param quantity The amount of packages in the order
     */
    State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    // Abstract classes that child functions must use
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    /**
     * Returns a verb based on the quantity of packages
     * @param singular The singular verb that gets returned
     * @param plural The plural verb that gets returned
     * @return A String that represents a verb
     */
    protected String getVerb(String singular, String plural) {
        if (quantity > 1) {
            return plural;
        }

        return singular;
    }
}
