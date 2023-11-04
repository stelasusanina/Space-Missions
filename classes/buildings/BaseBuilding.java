package classes.buildings;

import classes.astronomicalobjects.Planet;
import exceptions.NotEnoughResources;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseBuilding {
    private String name;
    private int level;
    private int constructionTime;
    double metalRequired;
    double crystalRequired;
    double gasRequired;
    double uraniumRequired;

    public BaseBuilding
            (String name, int level, int constructionTime, double metalRequired,
             double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public abstract void upgrade();

    public enum BuildingType {
        METALMINE,
        GASREFINERY,
        CRYSTALMINE,
        URANIUMMINE
    }

    public void construct(BuildingType buildingType, Planet planet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name, level and construction time of the building: ");
        String name = sc.nextLine();
        int level = sc.nextInt();
        int constructionTime = sc.nextInt();

        try {
            switch (buildingType) {
                case METALMINE:
                    MetalMine metalMine = new MetalMine(name, level, constructionTime);
                    planet.addBuilding(metalMine);
                    break;
                case GASREFINERY:
                    GasRefinery gasRefinery = new GasRefinery(name, level, constructionTime);
                    planet.addBuilding(gasRefinery);
                    break;
                case CRYSTALMINE:
                    if(crystalRequired > planet.getCrystal()){
                        throw new NotEnoughResources();
                    }
                    CrystalMine crystalMine = new CrystalMine(name, level, constructionTime);
                    planet.addBuilding(crystalMine);
                    break;
                case URANIUMMINE:
                    if(uraniumRequired > planet.getUranium()){
                        throw new NotEnoughResources();
                    }
                    UraniumMine uraniumMine = new UraniumMine(name, level, constructionTime);
                    planet.addBuilding(uraniumMine);
                    break;
            }
        }catch (NotEnoughResources e){
            System.out.println(e.getMessage());
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
