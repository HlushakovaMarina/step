package L23_01_2025;

import java.util.Random;

public class Building {
    int qualityWindows;
    int qualityDoors;
    String material;
    String street;


    String getDescription() {
        return "Здание на улице " + street + " : " + qualityWindows + " окон " + ","
                + qualityDoors + " дверей, из " + material;
    }

    public Building(int qualityWindows, int qualityDoors, String material, String street) {
        this.qualityWindows = qualityWindows;
        this.qualityDoors = qualityDoors;
        this.material = material;
        this.street = street;


    }


}
