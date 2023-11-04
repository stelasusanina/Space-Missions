package classes.buildings;

import classes.buildings.BaseBuilding;

public class GasRefinery extends BaseBuilding {
    private static final int metalRequired = 0;
    private static final int crystalRequired = 0;
    private static final int gasRequired = 100;
    private static final int uraniumRequired = 0;

    public GasRefinery(String name, int level, int constructionTime) {
        super(name, level, constructionTime, metalRequired, crystalRequired, gasRequired, uraniumRequired);
    }

    @Override
    public void upgrade() {
        int currentLevel = getLevel();
        currentLevel += 2;
        setLevel(currentLevel);
        //Upgrading with two levels because gas refineries are special
    }
}
