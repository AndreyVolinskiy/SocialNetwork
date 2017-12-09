package trainings.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFile {

    public static void main(String[] args) throws IOException {

        fromFileToFile();

    }

    private static void fromFileToFile() throws IOException {

//        File Reader/Writer
        int text;
        final String fileFrom = "src\\main\\resources\\fromConsole.txt";
        final String fileTo = "src\\main\\resources\\fromFile.txt";
        File file = new File(fileTo);
        if (new File(fileTo).exists()) {
            file.delete();
            file.createNewFile();
        }

        FileReader reader = new FileReader(fileFrom);
        FileWriter writer = new FileWriter(fileTo);

        while ((text = reader.read()) != -1) {
            System.out.print((char) text);
            if(text == ' '){ System.out.println("");}
            writer.write((char) text);
            if (text == ' ') {writer.write("\n");}
        }

        reader.close();
        writer.flush();
        writer.close();

    }

}
