/*
 * Written by Jamel Chouarfia
 */
 
package observer;

import java.util.ArrayList;

public class Watchman implements Subject {
    ArrayList<Observer> observers;
    private int warning;

    /**
     * Creates a new Watchman and initializes his list of townsfolk to warn
     * 
     */
    public Watchman() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Registers the observer with the Watchman
     * @param observer The observer being added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Attempts to remove the observer from the Watchman's list
     * @param observer The observer being removed
     */
    public void removeObserver(Observer observer) {
        int observersChecked = 0;

        // Checks to see if the observer that wants removing is actually in the list
        while (observers.size() > observersChecked) {
            if (observers.get(observersChecked).equals(observer)) {
                observers.remove(observersChecked);
                break;
            } else {
                observersChecked++;
            }
        }
    }

    /**
     * Notifies everyone on the Watchman's list
     */
    public void notifyObservers() {
        Observer currentObserver;
        int observersNotified = 0;

        while (observers.size() > observersNotified) {
            currentObserver = observers.get(observersNotified);
            currentObserver.update(warning);
            observersNotified++;
        }
    }
    
    /**
     * Plays trumpet(s) to issue a warning 
     * @param warning The severity of the warning. 1 plays only one trumpet and is a normal warning. 2 plays two trumpet and is an extreme warning.
     */
    public void issueWarning(int warning) {
        if (warning == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        } else {
            System.out.println("WARNING:  2 trumpets was played!");
        }

        this.warning = warning;

        notifyObservers();
    }
}
