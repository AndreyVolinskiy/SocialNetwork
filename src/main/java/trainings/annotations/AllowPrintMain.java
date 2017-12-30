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
        boolean annotationPresentTwo = methodTwo.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentThree = methodThree.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentFour = methodFour.isAnnotationPresent(AllowPrint.class);
        boolean annotationPresentFive = methodFive.isAnnotationPresent(AllowPrint.class);

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

        if (annotationPresentThree) {
            three();
        } else {
            throw new DoNotPrintException();
        }

        if (annotationPresentFour) {
            four();
        } else {
            throw new DoNotPrintException();
        }

        if (annotationPresentFive) {
            five();
        } else {
            throw new DoNotPrintException();
        }
    }

    @AllowPrint
    private static void five() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodFive = allowPrintMainClass.getDeclaredMethod("five");
        System.out.println(methodFive.getName());
    }

    @AllowPrint
    private static void four() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodFour = allowPrintMainClass.getDeclaredMethod("four");
        System.out.println(methodFour.getName());
    }

    @AllowPrint
    private static void three() throws NoSuchMethodException {
        AllowPrintMain allowPrintMain = new AllowPrintMain();
        Class<? extends AllowPrintMain> allowPrintMainClass = allowPrintMain.getClass();
        Method methodThree = allowPrintMainClass.getDeclaredMethod("three");
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
