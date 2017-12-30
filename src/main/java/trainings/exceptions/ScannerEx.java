package trainings.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("You entered not an integer!");
            e.printStackTrace();
        }

    }
}
