package trainings.io;

import java.io.*;
import java.util.Random;

public class EvenAndOddStrings {

    public static void main(String[] args) throws IOException {
        separator();
    }

    private static void separator() throws IOException {
        String filePath = "src\\main\\resources\\file.txt";
        String oddPath = "src\\main\\resources\\odd.txt";
        String evenPath = "src\\main\\resources\\even.txt";

//        if file not exist - create it

        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddPath));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenPath));

//        filling file.txt

        Random random = new Random();
        String fillString = "";
        int quantityOfStrings = random.nextInt(20);
        for (int i = 0; i < quantityOfStrings; i++) {
            for (int k = 0; k < 10 + random.nextInt(25); k++) {
                fillString += (char) (48 + random.nextInt(75));
            }
            fileWriter.write(fillString);
            fileWriter.write("\n");
            fillString = "";
        }
        fileWriter.flush();
        fileWriter.close();

//        separation of strings

        String text;
        int count = 1;

        while ((text = reader.readLine()) != null) {
            if (count % 2 == 0) {
                evenWriter.write(text);
                evenWriter.write("\n");
                count++;
            } else {
                oddWriter.write(text);
                oddWriter.write("\n");
                count++;
            }

        }
        reader.close();
        oddWriter.flush();
        oddWriter.close();

        evenWriter.flush();
        evenWriter.close();
    }
}
