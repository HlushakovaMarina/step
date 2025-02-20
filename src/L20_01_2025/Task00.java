package L20_01_2025;

import util.ArrayUtil;

import java.util.Arrays;

public class Task00 {
    public static void main(String[] args) {
        int[] a = new int[20];
        System.out.println(Arrays.toString(a));
        ArrayUtil.generateIntArray(a, 0, 20);
        System.out.println(Arrays.toString(a));
        int x = 1;
        int y = 2;
        function1(1, 2);
        System.out.println(x + "" + y);
       // Arrays.sort();
    }

    public static void function1(int a, int b) {
        a = 10;
        b = 20;
    }
}
