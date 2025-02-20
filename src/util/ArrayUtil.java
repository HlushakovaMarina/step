package util;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    private static final Random random = new Random();

    public static int[] generateIntArray(int size, int numberOrigin, int numberBround) {
        int[] array = random.ints(size, numberOrigin, numberBround).toArray();
        System.out.println("Сгенерированный массив ->" + Arrays.toString(array));
        return array;
    }

    public static void generateIntArray(int[] originArray, int numberOrigin, int numberBround) {
        int[] array = random.ints(originArray.length, numberOrigin, numberBround).toArray();
        System.out.println("Сгенерированный массив ->" + Arrays.toString(array));
        System.arraycopy(array, 0, originArray, 0, originArray.length);
    }

    public static long[] generateLongArray(int size, long numberOrigin, long numberBround) {
        long[] array = random.longs(size, numberOrigin, numberBround).toArray();
        System.out.println("Сгенерированный массив ->" + Arrays.toString(array));
       return array;
    }
}
