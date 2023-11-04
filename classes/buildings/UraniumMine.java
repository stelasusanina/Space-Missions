package classes.buildings;

import classes.buildings.BaseBuilding;

public class UraniumMine extends BaseBuilding {
    private static final int metalRequired = 0;
    private static final int crystalRequired = 0;
    private static final int gasRequired = 0;
    private static final int uraniumRequired = 100;

    public UraniumMine(String name, int level, int constructionTime) {
        super(name, level, constructionTime, metalRequired, crystalRequired, gasRequired, uraniumRequired);
    }

    @Override
    public void upgrade() {
        int currentLevel = getLevel();
        currentLevel += 5;
        setLevel(currentLevel);
        //Upgrading with 5 levels because uranium mines are very rare
    }
}
