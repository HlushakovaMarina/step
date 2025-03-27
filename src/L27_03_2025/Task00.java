package L27_03_2025;

import L13_02_2025.Cat;

import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);

        printTwice("Привет");
        printTwice(18);
        printTwice(integerBox);

        Pair<String,Integer> student = new Pair<>("Дима", 18);
        System.out.println(student.getKey());
        System.out.println(student.getValue());


    }

    public static <T> T printTwice(T value){
        System.out.println(value);
        System.out.println(value);
        return value;
    }
public static void printList(Box<? extends Number> item){

}
}
