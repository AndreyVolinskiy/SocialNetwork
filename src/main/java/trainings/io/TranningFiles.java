package trainings.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class TranningFiles {

    public static void main(String[] args) throws IOException {

        final String filePath = "src\\main\\resources\\file.txt";
        File file = new File(filePath);
//        System.out.println(file.getName());

        FileReader reader = new FileReader(file);

//        int data;
//
//        while ((data = reader.read()) != -1) {
//            System.out.print((char) data);
//        }
//
//        FileWriter writer = new FileWriter(file, true);
//        writer.write("Welcome");
//        writer.flush();
//        writer.close();
//        reader.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String data;
//        int count = 0;
//        while (((data = bufferedReader.readLine()) != null)) {
//            System.out.println(data);
//            count++;
//        }
//        System.out.println(count);
//        bufferedReader.close();
//
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
//        bufferedWriter.write("Hello");
//        bufferedWriter.flush();
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the line");
//        String line = scanner.nextLine();
//        System.out.println(line);
////        System.out.println("Enter the number");
//
//        int number = scanner.nextInt();
//        System.out.println(number+10);
//        scanner.close();

        int[] arrayOfInts = new int[10];

        String[] arrayOfStrings = new String[10];

        bufferedWriter.write(Arrays.toString(arrayOfStrings));
        System.out.println("");

        for (int i = 0; i < arrayOfStrings.length - 1; i++) {
            arrayOfStrings[i] = "kjsfvk" + i * 4;
            bufferedWriter.write(arrayOfStrings[i]);
            bufferedWriter.write("\n");

            bufferedWriter.flush();
        }
        System.out.println("");
//
//        for (int i = 0; i < arrayOfStrings.length - 1; i++) {
//            System.out.println("Enter the line");
//            arrayOfStrings[i] = scanner.nextLine();
//            bufferedWriter.write(arrayOfStrings[i]);
//            bufferedWriter.write("\n");
//
//            bufferedWriter.flush();
//
//
//        }


//        write();
//        task1();
//        task2();
//        task3();
//        task4();
        task6();
    }

    private static void write() throws IOException {
        final String filePath = "src\\main\\resources\\file.txt";

        String text = "Some text";
        Files.write(Paths.get(filePath), text.getBytes());
    }

    private static void task1() throws IOException {
        String text = "Hello";
        final String filePath = "src\\main\\resources\\file.txt";
        Files.write(Paths.get(filePath), text.getBytes());

    }

    private static void task2() throws IOException {
        final String filePath = "src\\main\\resources\\file.txt";
        final String filePath2 = "src\\main\\resources\\file2.txt";
        File file = new File(filePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String data;
        while (((data = bufferedReader.readLine()) != null)) {
            Files.write(Paths.get(filePath2), data.getBytes());
        }
    }

    private static void task3() throws IOException {
        System.out.println("Enter name of file:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String text;
        String path = "src\\main\\resources\\" + name;
        File file = new File(path);
        file.createNewFile();
        System.out.println("Enter the text:");
        text = scanner.nextLine();
        Files.write(Paths.get(path), text.getBytes());
        scanner.close();
    }


    private static void task4() throws IOException {
        final String filePath1 = "src\\main\\resources\\fileFrom.txt";
        final String filePath2 = "src\\main\\resources\\fileTo.txt";
        String text;
        String data = "((((((((";
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        file1.createNewFile();
        file2.createNewFile();
        Files.write(Paths.get(filePath1), data.getBytes());

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));

        text = bufferedReader.readLine();
        String textOut = text.replace('(', ')');
        Files.write(Paths.get(filePath2), textOut.getBytes());
    }

    private  static void task5() throws IOException {
        String text = "", name, username, hobby;
        final String filePath = "src\\main\\resources\\user.txt";
        File file = new File(filePath);
        FileWriter writer = new FileWriter(file, true);
        String textStop = "Stop";
        Scanner scanner = new Scanner(System.in);

        while (!text.equals(textStop)) {

            System.out.println("Say Stop to exit!");
            System.out.println("Enter your name:");
            text = scanner.nextLine();
            name = "name: " + text + "\n";
            writer.write(name);

            System.out.println("Enter your username:");
            text = scanner.nextLine();
            username = "username: " + text + "\n";
            writer.write(username);

            System.out.println("Enter your hobby:");
            text = scanner.nextLine();

            hobby = "hobby: " + text + "\n";
            writer.write(hobby);

            writer.flush();

            scanner.close();
            writer.close();
        }
    }

    private static void task6() {

        StringJoiner joiner = new StringJoiner("_next city_");
        joiner.add("Moscow");
        joiner.add("London");
        joiner.add("NewYork");
        joiner.add("Paris");
        joiner.add("Panama");

        System.out.println(joiner);
    }

}
