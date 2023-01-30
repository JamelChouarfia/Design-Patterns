package decorator;

public class Cone extends IceCream {
    ConeType coneType;

    /**
     * Sets the cone type used within the Ice Cream and sets the cost
     * @param coneType The cone being used to create the Ice Cream
     */
    public Cone(ConeType coneType) {
        this.coneType = coneType;

        switch (coneType.toString()) {
            case "SUGAR_CONE":
                super.description = "Sugar cone";
                return;
            case "WAFFLE_CONE":
                super.description = "Waffle cone";
                return;
            case "PRETZEL_CONE":
                super.description = "Pretzel cone";
                return;
            case "CHOCOLATE_DIPPED_CONE":
                super.description = "Chocolate dipped cone";
                return;
            default:
                return;
        }
    }
    
    /**
     * Sets the cost of the Ice Cream based on whichever cone is used
     */
    public double getCost() {
        switch (coneType.toString()) {
            case "SUGAR_CONE":
                return 0.75;
            case "WAFFLE_CONE":
                return 1.2;
            case "PRETZEL_CONE":
                return 1.8;
            case "CHOCOLATE_DIPPED_CONE":
                return 1.5;
            default:
                return 0;
        }
    }
    
}
