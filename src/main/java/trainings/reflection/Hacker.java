package trainings.reflection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Hacker {

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {

        List<String> reportList = new LinkedList<>();
        List<String> advanceReportList = new LinkedList<>();

        Victim victim = new Victim();

        String path1 = "src\\main\\java\\trainings\\reflection\\reportList.txt";
        String path2 = "src\\main\\java\\trainings\\reflection\\advancedReportList.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        FileWriter writer = new FileWriter(file1, true);

        Class<? extends Victim> clazz = victim.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            reportList.add("field: " + field.getName());
            writer.write("field: " + field.getName());
        }

        reportList.add("");
        writer.write("");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            reportList.add("method: " + method.getName());
            writer.write("method: " + method.getName());
        }
        reportList.add("");
        writer.write("");
//            int modifiers = method.getModifiers();
//            System.out.println("is private  - " + Modifier.isPrivate(modifiers));
//            System.out.println("is public  - " + Modifier.isPublic(modifiers));

//            Object defaultValue = method.getDefaultValue();
//            System.out.println(defaultValue);

//            Class<?>[] parameterTypes = method.getParameterTypes();
//            System.out.println(Arrays.toString(parameterTypes));

        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            reportList.add("constructor: " + constructor.getName());
            writer.write("constructor: " + constructor.getName());

        }



        Field[] Fields = clazz.getFields();
        for (Field field : Fields) {
            advanceReportList.add("field: " + field.getName());
            writer.write("field: " + field.getName());
        }

        advanceReportList.add("");
        writer.write("");

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            advanceReportList.add("method: " + method.getName());
            writer.write("method: " + method.getName());
        }
        advanceReportList.add("");
        writer.write("");

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            reportList.add("constructor: " + constructor.getName());
            writer.write("constructor: " + constructor.getName());

        }

        writer.write(String.valueOf(reportList));
        writer.flush();
        writer.close();

        for (String s : reportList) {
            System.out.println(s);
        }

        for (String s : advanceReportList) {
            System.out.println(s);
        }

//        Field name = clazz.getField("name");
//        System.out.println(name.getName());

        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Before: " + victim.getAge());
        field.set(victim, 22);
        System.out.println("After: " + victim.getAge());

        System.out.println("");

        Field field2 = clazz.getDeclaredField("name");
        field2.setAccessible(true);
        System.out.println("Before: " + victim.getName());
        field2.set(victim, "Alex");
        System.out.println("After: " + victim.getName());





    }




    }






