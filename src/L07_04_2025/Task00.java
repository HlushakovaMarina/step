package L07_04_2025;

import java.io.*;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
//        try (FileReader fileReader = new FileReader("file.txt")) {
//            int ch;
//            while ((ch = fileReader.read()) != -1) {
//                System.out.print((char) ch);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (BufferedReader bufferedReader = new BufferedReader(new
//                FileReader("file.txt"))){
//          String line;
//          while ((line = bufferedReader.readLine()) != null){
//              System.out.print(line);
//          }
//        } catch (IOException e) {
//            System.out.println("Файл не найден или поврежден file.txt");
//        }
//        File file = new File("file.txt");
//        try (Scanner scanner = new Scanner(file)){
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Файл не найден или поврежден file.txt");
//        }


        try (FileWriter fileWriter = new FileWriter("file2.txt", true)) { //  true - добавляет запесь, не перезаписывает
            fileWriter.write("Привет я говая строка 2 \n");
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл");
        }
    }


    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("Строка 1");
            writer.newLine();
            writer.write("Строка 2");
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл");
        }

        try (PrintWriter writer = new PrintWriter("file.txt")) {
            writer.println("С новой строки");
        } catch (IOException e) {
            System.out.println("Неудалось записать в файл");
        }
    }
}

