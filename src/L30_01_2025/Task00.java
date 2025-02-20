package L30_01_2025;

public class Task00 {
    public static void main(String[] args) {
        Wheel[] wheel = new Wheel[4];
        for (int i = 0; i<wheel.length; i++){
            wheel[i] = new Wheel("Демосезонные", 20,"Резина");
        }
        Car audi = new Car("Audi", "TT",
                1999, wheel);
       // System.out.println(audi);
WheelArray wheelArray = new WheelArray(4);
wheelArray.add(new Wheel("Демосезонные", 20,"Резина"));
wheelArray.add(new Wheel("Демосезонные", 20,"Резина"));
wheelArray.add(new Wheel("Демосезонные", 20,"Резина"));
wheelArray.add(new Wheel("Демосезонные", 20,"Резина"));
System.out.println(wheelArray);
wheelArray.add(new Wheel("Демосезонные", 20,"Резина"));
wheelArray.add(new Wheel("Летняя", 15,"Резина"));
System.out.println(wheelArray);
Wheel wheel1 = wheelArray.get(wheelArray.getSize);
System.out.println(wheel1);
        //сортировка массива по диаметру колес
        wheelArray.sortByDiameter();
        System.out.println(wheelArray);
        wheelArray.sortByType();
        System.out.println(wheelArray);

        int size = wheelArray.getSize();
        Wheel[]wheels=wheelArray.getWheels();

    }
}
