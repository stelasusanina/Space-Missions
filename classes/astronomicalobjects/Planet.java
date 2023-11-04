package classes.astronomicalobjects;

import classes.astronomicalobjects.OrbitableSpaceObject;
import classes.astronomicalobjects.SpaceObject;
import classes.buildings.BaseBuilding;
import interfaces.Orbiter;

import java.util.ArrayList;
import java.util.List;

public class Planet extends OrbitableSpaceObject implements Orbiter {
    public enum ResourceType {
        METAL,
        GAS,
        CRYSTAL,
        URANIUM
    }
    private int metal;
    private int gas;
    private int crystal;
    private int uranium;
    private List<BaseBuilding> buldings;
    public Planet(String name, int coordinateX, int coordinateY, int coordinateZ,
                  double mass, int metal, int gas, int crystal, int uranium) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.metal = metal;
        this.gas = gas;
        this.crystal = crystal;
        this.uranium = uranium;
        this.buldings = new ArrayList<>();
    }

    public void harvestResource(ResourceType type, int quantity) {
        switch (type) {
            case METAL:
                metal -= quantity;
                break;
            case GAS:
                gas -= quantity;
                break;
            case CRYSTAL:
                crystal -= quantity;
                break;
            case URANIUM:
                uranium -= quantity;
                break;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Planet: " + getName() + ", " + getCoordinateX() + ", "
                + getCoordinateY() + ", " + getCoordinateZ() + ", " + getMass());
    }

    @Override
    public void addOrbiter(SpaceObject orbiter) {
        getOrbiters().add(orbiter);
    }

    @Override
    public void orbit(SpaceObject target) {
        addOrbiter(target);
    }

    public void addBuilding(BaseBuilding b){
        buldings.add(b);
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getCrystal() {
        return crystal;
    }

    public void setCrystal(int crystal) {
        this.crystal = crystal;
    }

    public int getUranium() {
        return uranium;
    }

    public void setUranium(int uranium) {
        this.uranium = uranium;
    }

    public List<BaseBuilding> getBuildings() {
        return buldings;
    }
}
