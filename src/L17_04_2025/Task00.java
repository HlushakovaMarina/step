package L17_04_2025;

import L14_04_2025.Apple;
import L14_04_2025.Color;
import L14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

import static L14_04_2025.Color.GREEN;

public class Task00 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Юля");
        list.add("Сергей");
        list.add("Петя");

//        forEach(list, c -> System.out.println(c));
//        forEach(list, c -> list2.add(c + " Олегович"));
//        forEach(list2, c -> System.out.println(c));
        list.forEach(c -> list2.add(c + " Олегович"));
        System.out.println(list2);
        list.forEach(c -> System.out.println(c));
        System.out.println(list);
        List<Integer> mapList = map(list, s -> s.length());
        System.out.println(mapList);
        IntPredicate booleanIntFunction = (int i) -> i % 2 == 0;// для примитивных типов, для экономии памяти
        Random r = new Random();
        Supplier<Integer> supplier = () -> r.nextInt(100);
        System.out.println(supplier.get());

        // использование локальных переменные для лямбды
        final int a = 10;
        Runnable runnable = () -> System.out.println(a);


        List<Apple> apples = List.of(
                new Apple(100, Color.RED),
                new Apple(200, GREEN),
                new Apple(170, Color.YELLOW));
        List<Color> mapListColor = map(apples, s -> s.getColor());
        System.out.println(mapListColor);

        //сылки на методы
        List<Color> map = map(apples, Apple::getColor);
        List<Integer> map1 = map(apples, Apple::getWeight);
        apples.forEach(System.out::println);

        Supplier<Apple> a1 = Apple::new;
        Apple apple = a1.get();
        BiFunction<Integer, Color, Apple> appleBiFunction = Apple::new;
        Apple apple1 = appleBiFunction.apply(200, GREEN);

        apples.sort((a3, a4) -> a3.getWeight().compareTo(a4.getWeight()));
        Comparator<Apple> comparing = Comparator.comparing((Apple a2) -> a2.getWeight();
        apples.sort(comparing);
        apples.sort(Comparator.comparing(Apple::getWeight).reversed());// в обратную сторону сортировка через reversed
        apples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        Predicate<Apple> predicate = (Apple a5) -> a5.getWeight() == 100;
        Predicate<Apple> and = predicate.and(a5 -> GREEN.equals(a5.getColor()));// добавляем к яблоку а5 еще и цвет, вес 100
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
