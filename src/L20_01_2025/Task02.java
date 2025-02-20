package L20_01_2025;

import util.ArrayUtil;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        long num = 375292691795L;
        findTelNum(num);


    }

    private static void findTelNum(long num) {
        long[] array = ArrayUtil.generateLongArray(1000000, 375290000000L, 375300000000L);
        int index = -1;
        for (int i = 0; i < array.length; i++){
           if (array[i]==num) {
               // index = i;
               // break;
            }

            }

       System.out.println(index >-1 ? "Найден по индексу" + index : "Не найден");
    }
}
