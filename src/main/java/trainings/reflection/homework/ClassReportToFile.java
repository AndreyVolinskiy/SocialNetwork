package trainings.reflection.homework;

import networks.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClassReportToFile {

    public static void main(String[] args) throws IOException {

        User user = new User();
        createReportList(user.getClass());
    }

    private static void createReportList(Class inputClass) throws IOException {

        List<String> reportList = new LinkedList<>();
        String path = "src\\main\\java\\trainings\\reflection\\homework\\reportList.txt";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        FileWriter writer = new FileWriter(file, true);

        Class<? extends Class> clazz = inputClass.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            reportList.add("field: " + field.getName());
            int modifiers = field.getModifiers();
            if (Modifier.isFinal(modifiers)) {
                reportList.add("field is final");
            }
            if (Modifier.isProtected(modifiers)) {
                reportList.add("field is protected");
            }
            if (Modifier.isPrivate(modifiers)) {
                reportList.add("field is private");
            }
            if (Modifier.isPublic(modifiers)) {
                reportList.add("field is public");
            }
            if (Modifier.isStatic(modifiers)) {
                reportList.add("field is static");
            }
            reportList.add("");
        }
        reportList.add("");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            reportList.add("method: " + method.getName());

            int modifiers = method.getModifiers();
            if (Modifier.isFinal(modifiers)) {
                reportList.add("method is final");
            }
            if (Modifier.isProtected(modifiers)) {
                reportList.add("method is protected");
            }
            if (Modifier.isPrivate(modifiers)) {
                reportList.add("method is private");
            }
            if (Modifier.isPublic(modifiers)) {
                reportList.add("method is public");
            }
            if (Modifier.isStatic(modifiers)) {
                reportList.add("method is static");
            }

            Object defaultValue = method.getDefaultValue();
            String string = (String) defaultValue;
            reportList.add("default value: " + string);

            Class<?>[] parameterTypes = method.getParameterTypes();
            reportList.add("parameter types: " + Arrays.toString(parameterTypes));

            reportList.add("");
        }
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            reportList.add("constructor: " + constructor.getName());
        }
        for (String s : reportList) {
            System.out.println(s);
            writer.write(s + "\n");
        }
        writer.flush();
        writer.close();
    }
}













