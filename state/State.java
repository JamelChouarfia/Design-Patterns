package state;

public abstract class State {
    protected Package pkg;
    protected int quantity;

    State() {

    }

    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();

    protected String getVerb(String singular, String plural) {

    }
}
