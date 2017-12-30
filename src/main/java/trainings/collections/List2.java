package trainings.collections;

import java.util.ArrayList;

public class List2 {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> intList = new ArrayList();
        ArrayList<String> stringList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            arrayList.add("jshfvb" + i * 86 + 12);
        }
        arrayList.add(new List2());

        for (Object object : arrayList) {
            if (object instanceof Integer) {
                intList.add((Integer) object);
            }
            if (object instanceof String) {
                stringList.add((String) object);
            }
        }


        System.out.println(intList);
        System.out.println(stringList);




    }
}
