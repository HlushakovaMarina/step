package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class СollectionТasks {

    public static void main(String[] args) {
// 1.
        List<String> names = new ArrayList<>(List.of("Алексей",
                "Мария", "Алексей", "Дмитрий", "Мария", "Саша"));
        List<String> uniqueNames = removeDuplicates(names);
        System.out.println(uniqueNames);
// 2.
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 7);
        List<Integer> uniqueNumbers = findUniqueElements(numbers);
        System.out.println(uniqueNumbers);
// 3.
        List<String> list1 = List.of("Катя", "Мария", "Вася", "Дима");
        System.out.println("Лист 1 имеет дубликаты: " + hasDuplicates(list1));

        List<String> list2 = List.of("Катя", "Мария", "Катя", "Вася", "Дима");
        System.out.println("Лист 2 имеет дубликаты: " + hasDuplicates(list2));
// 4.
        Set<String> set1 = Set.of("Алексей", "Мария", "Дмитрий", "Вася");
        Set<String> set2 = Set.of("Мария", "Сергей", "Алексей", "Вася");
        Set<String> intersection = findIntersection(set1, set2);
        System.out.println(intersection);
// 5.
        Set<String> set3 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set4 = Set.of("Мария", "Сергей");
        Set<String> difference = findDifference(set3, set4);
        System.out.println(difference);
    }

    // 1.
    public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    // 2.
    public static List<Integer> findUniqueElements(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    // 3.
    public static boolean hasDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);
        if (set.size() != list.size()) {
            return true;
        } else {
            return false;
        }
    }

    // 4.
    public static Set<String> findIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set2);
        intersection.retainAll(set1);
        return intersection;
    }
// 5.
    public static Set<String> findDifference(Set<String> set3, Set<String> set4) {
        Set<String> difference = new HashSet<>(set3);
        difference.removeAll(set4);
        return difference;
    }
}

