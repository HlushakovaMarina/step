package L03_03_2025.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();

        stringList.add("Marina");
        stringList.add("Kate");

        stringList2.add("Dima");
        stringList2.add("Sasha");

        System.out.println("размер stringList =>" + stringList.size());
        stringList.addAll(stringList2);
        System.out.println("размер stringList =>" + stringList.size());
        System.out.println(stringList);

        stringList.clear();
        System.out.println(stringList);
        System.out.println(stringList.size());

        stringList.add("Dima");
        stringList.add("Nata");
        //stringList.add("Lena");
        boolean isDimaContains = stringList.contains("Dima");
        System.out.println(isDimaContains);
        boolean containsAll = stringList.contains(stringList2);
        System.out.println(containsAll);

        if (stringList.isEmpty()) {
            System.out.println();
        }
        boolean equals = stringList.equals(stringList2);
        System.out.println(equals);

        String s = stringList.get(0);
        System.out.println(s);
        int i = stringList.indexOf("Nata");
        System.out.println(i);

        stringList.remove("Dima");
        System.out.println(stringList);

        stringList.set(0, "Kate");
        System.out.println(stringList);
        String[] array = stringList.toArray(new String[0]);
        List<String> k = new ArrayList<>(20);
        System.out.println(stringList);

test();
    }

    public static void test() {
        Car audi =new Car("Audi",1988);
        Car bmw =new Car("BMW",2005);
        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        new Car("BMW", 2005);
        for (Car car : cars) {
            if (car.getYear()==2005){
                System.out.println(car);

            }

        }
        Iterator<Car> iterator=cars.iterator();
        while (iterator.hasNext()){
            Car next = iterator.next();
            if (next.getYear()==2005);
            iterator.remove();
            break;
        }
        System.out.println(cars);
    }


}
