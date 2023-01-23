/*
 * Written by Jamel Chouarfia
 */
 
package observer;

public class Teacher extends Watchman implements Observer{
    private Subject watchman;

     /**
     * Creates a new Teacher and registers him with the local Watchman
     * @param watchman The Watchman with which the Teacher registers with
     */
    public Teacher(Watchman watchman) {
        super();
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    public void update(int warning) {
        if (warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        } else {
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}