/*
 * Written by Jamel Chouarfia
 */
 
 package observer;

public class Knight extends Watchman implements Observer{
    private Subject watchman;
    
    /**
     * Creates a new Knight and registers him with the local Watchman
     * @param watchman The Watchman with which the Knight registers with
     */
    public Knight(Watchman watchman) {
        super();
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        } else {
            System.out.println("Knight: Prepares for battle");
        }
    }
}