package PredicateGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {
    // Возвращает первый элемент списка
    public static <T> T getFirst(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    // Возвращает минимальный из двух элементов
    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) <= 0 ? a : b;
    }

    // Выводит элементы массива
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Подсчитывает количество вхождений элемента в списке
    public static <T> int countOccurrences(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    // Проверяет, есть ли элемент в массиве
    public static <T> boolean contains(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Создает список из массива
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    // Копирует содержимое одного списка в другой
    public static <T> void copyList(List<T> one, List<T> another) {
        another.clear();
        another.addAll(one);
    }

    // Находит индекс элемента в массиве
    public static <T> int indexOf(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // Объединяет два списка в новый список
    public static <T> List<T> mergerLists(List<T> list1, List<T> list2) {
        List<T> mergers = new ArrayList<>(list1);
        mergers.addAll(list2);
        return mergers;
    }
}
