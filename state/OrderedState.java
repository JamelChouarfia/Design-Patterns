package state;

public class OrderedState extends State {
    private int days;

    OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
    }

    public String getStatus() {
        return "The " + super.pkg.getName() + " " + super.getVerb("was", "were") + " ordered";
    }

    public String getETA() {
        return "The " + super.pkg.getName() + " will be shipped within " + days + " business days";
    }

    public String delay() {
        days += 2;
        return "The " + super.pkg.getName() + " experienced a slight delay in manufacturing\nThe " + super.pkg.getName() + " will be shipped within " + days + " business days";
    }
    
}
