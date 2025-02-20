package L16_01_2025;

import util.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //deleteNumFromArray();
        //isPalindrome();
        isName();
    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60);
        int deleteIndex = 2; //Удалим элемент с индексом 2
        if (deleteIndex < intArray.length && deleteIndex >= 0) {
            int[] ints = new int[intArray.length - 1];
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (deleteIndex == i) {
                    continue;
                }
                ints[j] = intArray[i];
                j++;
            }
            System.out.println(Arrays.toString(ints));
        } else {
            System.out.println("Индекс вне диапазона");
        }
    }

    private static void isPalindrome() {
        int[] array = new int[]{1, 2, 3, 4, 3, 2, 1};
        boolean isPalindrome = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }

        }
        System.out.println(isPalindrome ? "Симметричный" : "Не симметричный");
    }

    private static void isName() {
        int[] array = new int[]{1, 2, 3, 4, 3, 2, 1};
        boolean isName = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i]) {
                isName = false;
                break;
            }

        }
       // System.out.println(isName ? "колличество цифр");
    }
}
