package trainings.interfaces;

public class Main {

    public static void main(String[] args) {

        printer printer = new HPPrinter();
        printer.print("print me");

        printer printer1 = new Canon();
        printer1.print("skjdhk");
    }
}
