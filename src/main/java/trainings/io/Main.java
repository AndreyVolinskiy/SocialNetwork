package trainings.io;

public class Main {

    public static void main(String[] args) {

        Code code = new Code();
        System.out.println(code.count);
        System.out.println(code.name);
        System.out.println(code.indicator);

        code.print();
        System.out.println(code.sqrt(5));
        System.out.println(code.number());


    }
}
