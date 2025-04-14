package L14_04_2025;

import L14_04_2025.impl.AppleGreenColorPredicate;
import L14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

import static L14_04_2025.Color.GREEN;

public class Task00 {
    public static void main(String[] args) {
        List<Apple> apples = List.of(new Apple(100, Color.RED),
                new Apple(200, GREEN),
                new Apple(170, Color.YELLOW),
                new Apple(250, Color.RED));

        List<Apple> apples1 = filterColorApple(apples, GREEN);
        List<Apple> heavyApple1 = filterHeavyApples(apples, 150);
        List<Apple> apples2 = filterApples(apples, GREEN, 150, true);
        List<Apple> apples3 = filterApplePredicate(apples, new AppleGreenColorPredicate());
        System.out.println(apples1);
        System.out.println(heavyApple1);
        System.out.println(apples2);
        System.out.println(apples3);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        filterApplePredicate(apples, new ApplePredicate() { // анонимный компоратор
//            @Override
//            public boolean test(Apple apple) {
//                return Color.RED.equals(apple.getColor());
//            }
//        });
        filterApplePredicate(apples, (Apple apple) -> Color.YELLOW.equals((apple.getColor()))); //лямбда выражение
        System.out.println(filterApplePredicate(numbers, (Integer i) -> i % 2 == 0));
    }

    public static List<Apple> filterColorApple(List<Apple> apples, Color color) {
        List<Apple> greenApple = new ArrayList<>();
        for (Apple apple : apples) {
            if (color.equals(apple.getColor())) {
                greenApple.add(apple);
            }
        }
        return greenApple;
    }

    public static List<Apple> filterHeavyApples(List<Apple> apples, int weight) {
        List<Apple> heavyApple = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                heavyApple.add(apple);
            }
        }
        return heavyApple;
    }

    public static List<Apple> filterApples(List<Apple> apples, Color color,
                                           int weight, boolean flag) {
        List<Apple> apples2 = new ArrayList<>();
        if (flag) {
            for (Apple apple : apples) {
                if (color.equals(apple.getColor())) {
                    apples2.add(apple);
                }
            }
        } else {
            for (Apple apple : apples) {
                if (apple.getWeight() > weight) {
                    apples2.add(apple);
                }
            }
        }
        return apples2;
    }

    public static <T> List<T> filterApplePredicate(List<T> edible,
                                                   ApplePredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : edible) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
