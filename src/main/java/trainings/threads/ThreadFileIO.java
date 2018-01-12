package trainings.threads;

import java.io.*;

public class ThreadFileIO {

    public static void main(String[] args) throws InterruptedException {

        Thread inFile = new Thread(new ThreadInFile());
        Thread fromFile = new Thread(new ThreadFromFile());
        inFile.start();
        inFile.join();
        fromFile.start();
    }

    public static class ThreadInFile implements Runnable {
        @Override
        public void run() {

            final String filePath = "src\\main\\resources\\threads.txt";
            File file = new File(filePath);

            try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                for (int i = 0; i < 10; i++) {
                    writer.write(i + " ");
                    Thread.sleep(200);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadFromFile implements Runnable {
        @Override
        public void run() {

            final String filePath = "src\\main\\resources\\threads.txt";
            File file = new File(filePath);

            try (final BufferedReader reader = new BufferedReader(new FileReader(file))) {
                reader.lines().forEach(System.out::println);
                Thread.sleep(200);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
