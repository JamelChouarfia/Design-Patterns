package state;

/*
 * Written by Jamel Chouarfia
 */

/**
 * A package that keeps track of its current state
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Creates a new package and initializes its variables
     * @param name The name of the package
     * @param quantity The amount of packages ordered by the customer
     */
    Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }

    /**
     * Sets the status of the package to ordered and informs the user of the shipping date
     * @return A String representing the status of the package and its estimated shipping date
     */
    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Sets the status of the package to InTransit and informs the user of the delivery date
     * @return A String representing the status of the package and its estimated delivery date
     */
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /**
     * Sets the status of the package to Delivered and informs the user
     * @return A String informing the user that the package has been delivered
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }

    /**
     * Delays the package and informs the user
     * @return A String informing the user that the package has been delayed
     */
    public String delay() {
        return state.delay();
    }

    /**
     * Sets the state of the package
     * @param state The new state of the package
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the name of the package
     * @return A String representing the name of the package
     */
    public String getName() {
        return name;
    }
}