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
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file, true);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text, Stop to break: ");

        while (true) {
            text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            } else {
                writer.write(text);
                writer.write("\n");
            }

        }
        scanner.close();
        writer.flush();
        writer.close();

    }
}
