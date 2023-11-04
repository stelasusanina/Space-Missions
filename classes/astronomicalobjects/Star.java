package classes.astronomicalobjects;

import interfaces.Orbiter;

public class Star extends OrbitableSpaceObject implements Orbiter {
    public Star(String name, int coordinateX, int coordinateY, int coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void displayInfo() {
        System.out.println("Star: " + getName() + ", " + getCoordinateX() + ", "
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
}
