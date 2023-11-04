package classes.astronomicalobjects;

import classes.astronomicalobjects.SpaceObject;

import java.util.ArrayList;
import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject {
    private List<SpaceObject> orbiters;
    public OrbitableSpaceObject(String name, int coordinateX, int coordinateY, int coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters = new ArrayList<SpaceObject>();
    }

    public abstract void displayInfo();
    public abstract void addOrbiter(SpaceObject orbiter);
    public List<SpaceObject> getOrbiters()
    {
        return orbiters;
    }
}
