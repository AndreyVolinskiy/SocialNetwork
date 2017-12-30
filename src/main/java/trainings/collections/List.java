package trainings.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class List {

    public static void main(String[] args) {

        Random random = new Random(100);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100));
        }

        arrayList.forEach(n -> System.out.print(n + " "));
        System.out.println("");

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                newArrayList.add(number);
            } else {
                iterator.remove();
            }

        }
        System.out.println(arrayList);
        System.out.println(newArrayList);


    }
}
