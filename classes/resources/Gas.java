package classes.resources;

public class Gas extends Resource {
    private static final double harvestRate = 0.5;
    public Gas(double amount) {
        super(amount, harvestRate);
    }

    @Override
    public String toString() {
        return "Gas left: " + getAmount();
    }
}
