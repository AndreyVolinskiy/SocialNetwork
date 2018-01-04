package trainings.annotations.myAnnotation;

import lombok.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ToString
public class Example {
    int age;
    int height;
    String name;

    public static void main(String[] args) throws NoSuchMethodException {

        Example example = new Example();
        Class<? extends Example> clazz = example.getClass();


        Method clazzDeclaredMethod = clazz.getDeclaredMethod("whichPrinter");
        Annotation annotation = clazzDeclaredMethod.getAnnotation(MyAnnotation.class);
        String clazzDeclaredMethodName = clazzDeclaredMethod.getName();
        if (clazzDeclaredMethod.isAnnotationPresent(MyAnnotation.class)) {
            System.out.println(clazzDeclaredMethodName);
        } else {
            System.out.println("No annotation");
        }


    }
    @MyAnnotation(printOut = "output text", whichPrinter = "HP")
    String whichPrinter() {
        return null;
    }
}
