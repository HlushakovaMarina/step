package L21_04_2025;

import java.util.*;
import java.util.stream.Collectors;

public class Task00 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));

        List<String> collect = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);

        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .distinct()
                .forEach(System.out::println);


        menu.stream() // выводит кол-во букв в имени
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean isVegetarian = menu.stream().anyMatch(Dish::isVegetarian);// найдет совпадение, есть ли такое
        boolean anyMatch = menu.stream().anyMatch(dish -> dish.getCalories() < 1000);// все ли больше 1000
        boolean nonedMatch = menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);//
        Optional<Dish> any = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
        if (any.isPresent()) {
            Dish dish = any.get();
        }
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        Optional<Dish> first = menu.stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        int sum = menu.stream().mapToInt(Dish::getCalories)
                .sum();//ищем сумму всех колорий
        int i = menu.stream().mapToInt(Dish::getCalories)
                .max().orElse(1);
        Map<Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect1);

//        System.out.println(calories(menu));
    }

//    public static List<String> calories(List<Dish> menu) {
//        List<Dish> iscalories = new ArrayList<>();
//        for (Dish dish : menu) {
//            if (dish.getCalories() < 400) {
//                iscalories.add(dish);
//            }
//        }
//        Comparator<Dish> comparator = Comparator.comparing(Dish::getCalories);
//        iscalories.sort(comparator);
//        List<String> names = new ArrayList<>();
//        for (Dish iscalory : iscalories) {
//            names.add(iscalory.getName());
//        }
//        return names;
//    }
}
