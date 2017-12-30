package trainings.exceptions;

public class Ex1 {

    public static void main(String[] args) {

        try {
            divisionByNull();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            print();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Cought!!");
        }
    }

    private static void divisionByNull() {
        int div = 5 / 0;
    }

    private static void print() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[5];
        int integer = array[7];
    }
}
