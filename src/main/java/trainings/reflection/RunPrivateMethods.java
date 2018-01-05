package trainings.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunPrivateMethods {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        final Victim victim = new Victim();
        final Class<? extends Victim> clazz = victim.getClass();
        final Method method = clazz.getDeclaredMethod("exampleMethod");
        method.setAccessible(true);
        final Object invoke = method.invoke(victim);
        final String name;
        final String integer;

        if (invoke instanceof String) {
            name = (String) invoke;
        } else {
            name = "It's always string!";
        }
        System.out.println(name);


        if (invoke instanceof Integer) {
            integer = (String) invoke;
        } else {
            integer = "It's always string!";
        }
        System.out.println(name);
    }
}
