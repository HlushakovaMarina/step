package L21_04_2025;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Dish> menu2 = Arrays.asList(
                new Dish("pork2", false, 500, Type.MEAT),
                new Dish("beef2", false, 600, Type.MEAT),
                new Dish("chicken2", false, 300, Type.MEAT),
                new Dish("french fries2", true, 550, Type.OTHER),
                new Dish("rice2", true, 360, Type.OTHER),
                new Dish("season fruit2", true, 130, Type.OTHER),
                new Dish("pizza2", true, 570, Type.OTHER),
                new Dish("prawns2", false, 350, Type.FISH),
                new Dish("salmon2", false, 470, Type.FISH));

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
        int i2 = menu.stream().mapToInt(Dish::getCalories)
                .max().orElse(1);
        Map<Type, List<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect1);

        List<List<Dish>> listList = List.of(menu, menu2);
        List<Dish> collect2 = listList.stream().
                map(Collection::stream).
                flatMap(Stream::distinct)
                .collect(Collectors.toList());// схлопывание листов
        List<Dish> collect3 = listList.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());// схлопывание листов использовать такой вариант
        // если через Colleсtors, то коллекция изменяемая, а если .toList(), тогда неизменяемая.

        int[] nums = {1, 2, 3, 4};
        int sum1 = Arrays.stream(nums).sum();
        Dish nullDish = null;
        //поток для объектов
        Stream.of("home", "java", "dish", "javascript").map(String::toUpperCase).forEach(System.out::println);
// пустой поток данных, проверка на null
        Stream.ofNullable(nullDish).map(Dish::getCalories).forEach(System.out::println);
// создание бесконечных потоков
        Stream.iterate(0, n -> n + 3)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        String stringDishNames = menu.stream().map(Dish::getName)
                .collect(Collectors.joining(", "));
        System.out.println(stringDishNames);
        Long collect4 = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.counting());
        System.out.println(collect4);

        Optional<Dish> collect5 = menu.stream().collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
        System.out.println(collect5);

        Integer collect6 = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(collect6);

        Double collect7 = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(collect7);

        IntSummaryStatistics statistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(statistics.getMax());

        // работа с примитивными типами
        int sum2 = menu.stream().mapToInt(Dish::getCalories).sum();

        Map<String, List<Dish>> collect8 = menu.stream().collect(Collectors.groupingBy(Dish::getName));

        Map<String, List<Dish>> collect9 = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return "DIET";
            } else if (dish.getCalories() <= 700) {
                return "NORMAL";
            } else {
                return "FAT";
            }
        }));

        Map<Type, List<Dish>> typyToListDishMoreThen500 = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(typyToListDishMoreThen500);

        Map<Type, List<Dish>> collect10 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.filtering(dish -> dish.getCalories() > 500, Collectors.toList())));
        System.out.println(collect10);

        Map<Type, Long> collect11 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(collect11);

        Map<Type, Optional<Dish>> mapOpt = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(mapOpt);

        Map<Type, Dish> mapDish = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mapDish);

        //проверка на null
        Optional<Integer> i1 = Optional.ofNullable(nullDish).map(Dish::getCalories);
        System.out.println(i1);
//        System.out.println(calories(menu));

        StringBuilder sb = new StringBuilder("abc");
        for (int i = 0; i < 1000; i++) {
            sb.append("1");
                    }
        System.out.println(sb);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        System.out.println(year);
        Month month=now.getMonth();
        int i = month.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(i);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);

        LocalDate localDate = LocalDate.of(2024, 11, 2);
        String displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(displayName);

        LocalTime lt= LocalTime.of(13,14,44);
        LocalTime parse = LocalTime.parse("13:34:12");
        LocalDate date = LocalDate.parse("2025-02-22");
        System.out.println(date);

        LocalDateTime ldt = LocalDateTime.of(2017,Month.NOVEMBER,21,13,35,29);
//        LocalDateTime vst = LocalDateTime.now(ZoneId.of("VST"));
        System.out.println(ldt);

        Duration between = Duration.between(LocalTime.of(15, 15, 15), LocalTime.of(16, 16, 16));
        long minutes = between.toMinutes();
        System.out.println(minutes);

        LocalDate date1 = date.withYear(2000);
        System.out.println(date1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse1 = LocalDate.parse("10/02/2009", dateTimeFormatter);
        System.out.println(parse1);
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
