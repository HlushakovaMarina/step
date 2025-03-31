package L31_03_2025;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task00 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/L31_03_2025/one.txt");
            int i = Integer.parseInt("Привет");
            System.out.println("файл найден");
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Файл не найден по такому-то пути" +
                    " или не число в строке" + e);
        } catch (IOException e) { //родитель
            System.out.println("");
        } catch (Exception e) { // родитель
            System.out.println("Общая ошибка");
        } finally {
            // закрывает потоки
            System.out.println("Выполняем в любом случае");
        }
        System.out.println("После try/catch");
        try {
            test2(38);
        } catch (AgeException e) {
            System.out.println("Что-то пошло не так");
        }
    }

    private static void test2(int age) {
        if (age < 18) {
            throw new AgeException("Возраст меньше 18");
        }
    }

    private static void test4() throws NumberException {
        try {
            Integer.parseInt("Куку");
        } catch (NumberFormatException e) {
            throw new NumberException("У нас не цифра");
        }
    }
}