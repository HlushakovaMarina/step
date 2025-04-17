package PredicateGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static PredicateGeneric.GenericExamples.*;
import static PredicateGeneric.PredicateExamples.*;

public class Main00 {
    public static void main(String[] args) {

        List<String> strings = List.of("Апельсин", "Барабан", "Аисты", "Пианино");
        List<String> strings1 = List.of();
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> numbers1 = Arrays.asList(2, 4, -6, 8, 10);
        List<Integer> ages = List.of(27, 18, 30, 19, 42);
        Predicate<Integer> isAdult = age -> age >= 18; //TODO пишем коментарий

        // есть ли строки, начинающиеся с "A"
        boolean anyStartsWithA = anyMatch(strings, s -> s.startsWith("А"));
        boolean anyStartsWithA1 = anyMatch(strings1, s -> s.startsWith("А"));
        System.out.println("Есть строки, начинающиеся с 'А': " + anyStartsWithA);
        System.out.println("Есть строки, начинающиеся с 'А': " + anyStartsWithA1);

        // все числа больше 0?
        boolean allNumbersThan0 = allMatch(numbers, n -> n > 0);
        System.out.println("Все числа больше 0? " + allNumbersThan0);
        boolean allNumbersThan0_1 = allMatch(numbers1, n -> n > 0);
        System.out.println("Все числа больше 0? " + allNumbersThan0_1);
        // Все люди старше 18?
        boolean allAdults = allMatch(ages, isAdult);
        if (allAdults) {
            System.out.println("Все люди старше 18 лет.");
        } else {
            System.out.println("Есть люди младше 18 лет.");
        }

        // найти строку, содержащую "java"
        String firstContainsJava = findFirstMatch(strings, s -> s.contains("java"));
        System.out.println("Первая строка, содержащая 'java': " + firstContainsJava);

        // строки длиннее 5 символов
        List<String> longerThan5 = filter(strings, s -> s.length() > 5);
        System.out.println("Строки длиннее 5 символов: " + longerThan5);

        // getFirst
        List<Integer> numbers2 = List.of(1, 2, 3, 4);
        Integer first = getFirst(numbers2);
        System.out.println("Первый элемент: " + first);

        // min
        String minString = min("цветок", "крокодил");
        System.out.println("Минимальная строка: " + minString); //????? считает не по кол-ву букв, а по алфавиту

        // printArray
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        printArray(intArray);

        // countOccurrences
        List<String> names = List.of("Кот", "Собака", "Кот", "Жираф", "Кот", "Петух");
        int catCount = countOccurrences(names, "Кот");
        System.out.println("Количество Кот: " + catCount);

        // contains
        String[] nameArray = {"Кот", "Пес", "Змея"};
        boolean hasSnake = contains(nameArray, "Змея");
        System.out.println("Есть Змея в массиве: " + hasSnake);

        // arrayToList
        Integer[] nums = {10, 20, 30};
        List<Integer> numList = arrayToList(nums);
        System.out.println("Список из массива: " + numList);

        // copyList
        List<String> oneList = new ArrayList<>(List.of("Книга", "Журнал", "Буклет"));
        List<String> anotherList = new ArrayList<>();
        copyList(oneList, anotherList);
        System.out.println("Скопированный список: " + anotherList);

        // indexOf
        String[] letters = {"А", "Б", "В"};
        int indexB = indexOf(letters, "Б");
        System.out.println("Индекс Б: " + indexB);

        // mergerLists
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> mergersList = mergerLists(list1, list2);
        System.out.println("Объединенный список: " + mergersList);
    }
}

