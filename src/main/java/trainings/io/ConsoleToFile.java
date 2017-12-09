package trainings.io;

import java.io.*;
import java.util.Scanner;

public class ConsoleToFile {

    public static void main(String[] args) throws IOException {

        fromConsoleToFile();
    }

    private static void fromConsoleToFile() throws IOException {

//        FileWriter

        String text;
        final String filePath = "src\\main\\resources\\fromConsole.txt";
        File file = new File(filePath);
        if (new File(filePath).exists()) {
            file.delete();
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text, Stop to break: ");

        while (true) {
            text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            } else {
                fileWriter.write(text);
                fileWriter.write("\n");
            }
        }
        scanner.close();
        fileWriter.flush();
        fileWriter.close();

    }
}
