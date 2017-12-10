package trainings.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Homework {

    public static void main(String[] args) throws IOException {
        task5();
    }

    private  static void task5() throws IOException {
        String text, name, username, hobby;
        final String filePath = "src\\main\\resources\\user.txt";
        File file = new File(filePath);
        FileWriter writer = new FileWriter(file, true);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Say Stop to exit!");
            System.out.println("Enter your name:");
            text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            }
            name = "name: " + text + "\n";
            writer.write(name);

            System.out.println("Enter your username:");
            text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            }
            username = "username: " + text + "\n";
            writer.write(username);

            System.out.println("Enter your hobby:");
            text = scanner.nextLine();
            if (text.equals("Stop")) {
                break;
            }
            hobby = "hobby: " + text + "\n";
            writer.write(hobby);
            writer.write("\n");
        }
        writer.flush();
        scanner.close();
        writer.close();
    }
}
