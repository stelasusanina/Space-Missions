package classes.resources;

import classes.resources.Resource;

public class Uranium extends Resource {
    private static final double harvestRate = 0.1;
    public Uranium(double amount) {
        super(amount, harvestRate);
    }

    @Override
    public String toString() {
        return "Uranium left: " + getAmount();
    }
}
