package L20_01_2025;

import util.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    private static int[] ints;

    public static void main (String[] args) {
        sort();
        search();
        fill();

    }

    private static void fill() {
        int [] a = new int[50];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,8);
        System.out.println(Arrays.toString(a));
    }

    private static void search() {
        int[] ints = ArrayUtil.generateIntArray(20,0,20);
        Arrays.sort(ints);
        int index = Arrays.binarySearch(ints, 5);
        System.out.println(index>=0? "Найден элемент по индексу" +index : " Не найден");
    }

    private static void sort() {
        int[] ints = ArrayUtil.generateIntArray(20,0,20);
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

    }
}
