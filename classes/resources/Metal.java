package classes.resources;

public class Metal extends Resource {
    private static final double harvestRate = 1.0;
    public Metal(double amount) {
        super(amount, harvestRate);
    }

    @Override
    public String toString() {
        return "Metal left: " + getAmount();
    }
}
