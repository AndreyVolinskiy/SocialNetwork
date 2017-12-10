package trainings.io;

import java.io.*;

public class FileToFile {

    public static void main(String[] args) throws IOException {

        fromFileToFile();

    }

    private static void fromFileToFile() throws IOException {

//        File Reader/Writer

        int text;
        final String fileFrom = "src\\main\\resources\\fromConsole.txt";
        final String fileTo = "src\\main\\resources\\fromFile.txt";

        FileReader reader = new FileReader(fileFrom);
        FileWriter writer = new FileWriter(fileTo);

        while ((text = reader.read()) != -1) {
            writer.write((char) text);
            if (text == ' ') {writer.write("\n");}
        }

        reader.close();
        writer.flush();
        writer.close();

    }

}