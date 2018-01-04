package trainings.annotations;

import java.lang.reflect.Method;

@Deprecated
@RemindMe(reason = "because", when = "just right now")
public class NewClass {

    public static void main(String[] args) throws NoSuchMethodException {

        NewClass newClass = new NewClass();
        Class<? extends NewClass> clazz = newClass.getClass();

        boolean present = clazz.isAnnotationPresent(RemindMe.class);
        System.out.println(present);

        Method methodOne = clazz.getDeclaredMethod("one");
        boolean annotationPresentOne = methodOne.isAnnotationPresent(CodingTime.class);
        System.out.println(annotationPresentOne);
        Method methodTwo = clazz.getDeclaredMethod("two");
        boolean annotationPresentTwo = methodTwo.isAnnotationPresent(Reference.class);
        System.out.println(annotationPresentTwo);

        two();
    }

    /**
     * @throws NoSuchMethodException
     */
@Deprecated
    @Reference
    private static void two() throws NoSuchMethodException {
        NewClass newClass = new NewClass();
        Class<? extends NewClass> clazz = newClass.getClass();
        Method methodTwo = clazz.getDeclaredMethod("one");
        CodingTime methodTwoAnnotation = methodTwo.getAnnotation(CodingTime.class);
        System.out.println(methodTwoAnnotation.task());

    }

    @CodingTime(task = "get method")
    private static void one() {
    }
}
