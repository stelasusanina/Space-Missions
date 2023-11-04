package classes;

import classes.astronomicalobjects.Planet;
import classes.astronomicalobjects.Satellite;
import classes.astronomicalobjects.Star;
import classes.buildings.BaseBuilding;
import classes.buildings.GasRefinery;
import classes.buildings.MetalMine;
import classes.buildings.CrystalMine;
import classes.buildings.UraniumMine;
import classes.resources.Crystal;
import classes.resources.Gas;
import classes.resources.Metal;
import classes.resources.Uranium;
import exceptions.NotEnoughResources;

public class Main {
    public static void main(String[] args) {
        // Create a star and a planet
        Star sun = new Star("Sun", 0, 0, 0, 100000);
        Planet earth = new Planet("Earth", 100, 200, 300, 10000, 500, 300, 200, 100);

        // Add the planet to orbit the star
        sun.addOrbiter(earth);

        // Construct some buildings on the planet
        BaseBuilding metalMine = new MetalMine("Metal Mine", 1, 10);
        BaseBuilding gasRefinery = new GasRefinery("Gas Refinery", 1, 15);

        earth.addBuilding(metalMine);
        earth.addBuilding(gasRefinery);


        earth.harvestResource(Planet.ResourceType.METAL, 100);
        earth.harvestResource(Planet.ResourceType.GAS, 50);


        // Display information about the star, planet, and buildings
        sun.displayInfo();
        earth.displayInfo();
        for (BaseBuilding building : earth.getBuildings()) {
            System.out.println("Building: " + building.getName() + " (Level " + building.getLevel() + ")");
        }

        // Upgrade buildings
        metalMine.upgrade();
        gasRefinery.upgrade();

        // Display updated information about the buildings
        for (BaseBuilding building : earth.getBuildings()) {
            System.out.println("Updated Building: " + building.getName() + " (Level " + building.getLevel() + ")");
        }

        // Create and manage resources on the planet
        Metal metalResource = new Metal(1000);
        Gas gasResource = new Gas(500);
        Crystal crystalResource = new Crystal(200);
        Uranium uraniumResource = new Uranium(100);

        System.out.println(metalResource.toString());
        System.out.println(gasResource.toString());
        System.out.println(crystalResource.toString());
        System.out.println(uraniumResource.toString());

        // Simulate orbiting a planet with a satellite
        Satellite satellite = new Satellite("Satellite 1", 150, 250, 350, 1);
        earth.orbit(satellite);

        // Display updated information about the satellite
        satellite.displayInfo();
    }
}
