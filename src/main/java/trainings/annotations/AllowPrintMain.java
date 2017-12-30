package trainings.annotations;

import java.lang.reflect.Method;

@AllowPrint
public class AllowPrintMain {

    public static void main(String[] args) throws NoSuchMethodException {

        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();

        Method methodOne = allowPrintMainClass.getDeclaredMethod("one");
        Method methodTwo = allowPrintMainClass.getDeclaredMethod("two");
        Method methodThree = allowPrintMainClass.getDeclaredMethod("three");
        Method methodFour = allowPrintMainClass.getDeclaredMethod("four");
        Method methodFive = allowPrintMainClass.getDeclaredMethod("five");
        boolean annotationPresentOne = methodOne.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentTwo = methodOne.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentThree = methodOne.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentFour = methodOne.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentFive = methodOne.isAnnotationPresent(AllowPrint.class);

        if (annotationPresentOne) {
            one();
        } else {
            throw new DoNotPrintException();
        }

        if (annotationPresentTwo) {
            two();
        } else {
            throw new DoNotPrintException();
        }
    }

    @AllowPrint
    private static void five() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodFive = allowPrintMainClass.getDeclaredMethod("two");
        System.out.println(methodFive.getName());
    }

    @AllowPrint
    private static void four() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodFour = allowPrintMainClass.getDeclaredMethod("two");
        System.out.println(methodFour.getName());
    }

    @AllowPrint
    private static void three() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodThree = allowPrintMainClass.getDeclaredMethod("two");
        System.out.println(methodThree.getName());

    }

    @AllowPrint
    private static void two() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodTwo = allowPrintMainClass.getDeclaredMethod("two");
        System.out.println(methodTwo.getName());
    }

    @AllowPrint
    private static void one() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodOne = allowPrintMainClass.getDeclaredMethod("one");
        System.out.println(methodOne.getName());

    }

}
