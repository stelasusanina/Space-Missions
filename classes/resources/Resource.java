package classes.resources;

public abstract class Resource {
    private double amount;
    private double harvestRate;
    public Resource(double amount, double harvestRate){
        this.amount = amount;
        this.harvestRate = harvestRate;
    }
    public void harvest(){
        double currentAmount = getAmount();
        while (getAmount() <= 0){
            currentAmount -= getHarvestRate();
            System.out.println(toString());
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getHarvestRate() {
        return harvestRate;
    }

    public void setHarvestRate(double harvestRate) {
        this.harvestRate = harvestRate;
    }
}
