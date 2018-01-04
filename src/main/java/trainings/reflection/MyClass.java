package trainings.reflection;

import lombok.ToString;
import trainings.annotations.myAnnotation.MyAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

//@Setter
//@Getter
@ToString
//@MyAnnotation(printOut = "1", whichPrinter = "2")
public final class MyClass implements MyInterface {

     private int number = 625;
     private String name = "Alex";
     boolean yesOrNo = true;
     List<String> stringList;



    @MyAnnotation(printOut = "1", whichPrinter = "2")
 public final void printIt() {
        int i;
        String s;

}


    private MyClass(int number, String name, boolean yesOrNo, List<String> stringList) {
        this.number = number;
        this.name = name;
        this.yesOrNo = yesOrNo;
        this.stringList = stringList;
    }

    public MyClass() {
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, NoSuchFieldException {

        MyClass myClass = new MyClass();
        Class<? extends MyClass> clazz = myClass.getClass();
//        System.out.println(clazz.getName());
//        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
//        System.out.println(clazz.getDeclaredMethod("toString"));
//        Annotation annotation = clazz.getAnnotation(MyAnnotation.class);
//        System.out.println(annotation);
//        Method method = clazz.getDeclaredMethod("printIt");
//        Class<?> declaringClass = method.getDeclaringClass();
//        System.out.println(declaringClass.getName());
//        System.out.println(clazz.getTypeName());
//        System.out.println(clazz.getPackage());

//        int modifiers = clazz.getModifiers();
//        if (Modifier.isPublic(modifiers)) {
//            System.out.println("Public");
//        }
//        if (Modifier.isPrivate(modifiers)) {
//            System.out.println("Private");
//        }
//        if (Modifier.isProtected(modifiers)) {
//            System.out.println("Protected");
//        }
//        if (Modifier.isFinal(modifiers)) {
//            System.out.println("Final");
//        }
//
//        Class<?>[] interfaces = clazz.getInterfaces();
//        System.out.println(Arrays.toString(interfaces));

//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//            System.out.println(field.getType());
//        }
//
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            Class<?> type = declaredField.getType();
//            System.out.println(declaredField.getName());
//            System.out.println(type);
//            System.out.println(declaredField.get(myClass));
//        }
//
//        Field clazzField = clazz.getField("number");
//        System.out.println(clazzField.get(myClass));
//        clazzField.set(myClass, 100000);
//        System.out.println(clazzField.get(myClass));


//        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            Class<?>[] parameterTypes = constructor.getParameterTypes();
//            for (Class<?> parameterType : parameterTypes) {
//                System.out.println(parameterType.getName());
//            }
//        }


//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println("Method name: " + method.getName());
//            System.out.println("Returning type: " + method.getReturnType().getName());
//
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class<?> type : parameterTypes) {
//                System.out.println("Parameters of methods:" + type.getName());
//            }
//        }

//
//        System.out.println(myClass);
//        Field number = clazz.getDeclaredField("number");
//        number.setAccessible(true);
//        number.set(myClass, 111111111);
//        System.out.println(myClass);


    }

    @Override
    public void methodOne() {

    }

    @Override
    public String methodTwo() {
        return "returning message";
    }
}
