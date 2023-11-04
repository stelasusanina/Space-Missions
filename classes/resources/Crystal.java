package classes.resources;

public class Crystal extends Resource {
    private static final double harvestRate = 0.2;
    public Crystal(double amount) {
        super(amount, harvestRate);
    }

    @Override
    public String toString() {
        return "Crystal left: " + getAmount();
    }
}
