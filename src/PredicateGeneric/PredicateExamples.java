package PredicateGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    // Проверка списка на наличие хотя бы одного элемента
    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        return list.stream().anyMatch(predicate);
    }

    // Проверка, удовлетворяют ли все элементы списка предикату
    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    // Поиск первого элемента, удовлетворяющего предикату
    public static <T> T findFirstMatch(List<T> list, Predicate<T> predicate) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        for (T t : list) {
            if (predicate.test(t)) {
                return t;
            }
        }

        return null;
    }


    // Фильтрация списка по предикату
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
