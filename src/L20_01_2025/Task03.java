package L20_01_2025;

import util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.generateIntArray(10, 0, 10);
        bubblesort(a);

    }

    private static void bubblesort(int[] a) {
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
