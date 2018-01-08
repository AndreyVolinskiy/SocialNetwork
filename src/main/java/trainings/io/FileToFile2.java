package trainings.io;

import java.io.*;

public class FileToFile2 {

    public static void main(String[] args) throws IOException {

        fromFileToFile();

    }

    private static void fromFileToFile() throws IOException {

//      Buffered Reader/Writer

        String s;
        final String fileFrom = "src\\main\\resources\\fromConsole.txt";
        final String fileTo = "src\\main\\resources\\fromFile.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileFrom));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTo));

        while ((s = reader.readLine()) != null) {
            writer.write(s);
            writer.write("\n");
        }

        reader.close();
        writer.flush();
        writer.close();



    }

}
