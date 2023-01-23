/*
 * Written by Jamel Chouarfia
 */
 
package observer;

public class ShopOwner extends Watchman implements Observer{
    private Subject watchman;

    /**
     * Creates a new Shop Owner and registers him with the local Watchman
     * @param watchman The Watchman with which the Shop Owner registers with
     */
    public ShopOwner(Watchman watchman) {
        super();
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        } else {
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}
