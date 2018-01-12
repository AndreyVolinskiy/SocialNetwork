package trainings.jenerics;

public class Service {

    public static void main(String[] args) {

        Printer<Integer> integerPrinter = new Printer<>();
        integerPrinter.print(56);

        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.print("hsikjhb");

        Wall<Integer> integerWall = new Wall<>();
        System.out.println(integerWall.returnWhatResive(6555566));

        Wall<String> stringWall = new Wall<>();
        System.out.println(stringWall.returnWhatResive("jsfvbj"));
    }
}
