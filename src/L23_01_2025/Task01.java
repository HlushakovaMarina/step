package L23_01_2025;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {
        //createBuilding();
        create200Building();





    }

    private static void create200Building() {
        Building[] buildings = new Building[200];
        Random random = new Random();
        for (int i = 0; i < buildings.length; i++) {
            int randomWindowCount= random.nextInt(20);
            int randomDoorsCount = random.nextInt(20);
            buildings[i] = new Building(randomWindowCount,randomDoorsCount,"Кирпич","Куйбышева");

        }
        for (int i = 0; i < buildings.length; i++) {
            System.out.println(buildings[i].getDescription());
        }
    }

    private static void createBuilding() {
        Building building1 = new Building(7,5,"кирпич","Фрунзе");
        Building building2= new Building(20,17,"Бревно","Кирова");
        System.out.println(building1.getDescription());
        System.out.println(building2.getDescription());
    }
}
