package trainings.exceptions;

public class Exception3 {

    public static void main(String[] args) {

        int[] array = new int[5];
        int number = 0;
        try {
            number = array[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


        String name = "Bob";
        if (name.equals("Andrey")) {
            System.out.println("True");
        }else System.out.println("False");

        name = null;
        try {
            if (name.equals("Andrey")) {
                System.out.println("True");
            }else System.out.println("False");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        String something = "smth";
        try {
            int integer = Integer.valueOf(something);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
