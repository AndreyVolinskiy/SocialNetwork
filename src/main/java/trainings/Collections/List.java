package trainings.Collections;

import java.util.ArrayList;
import java.util.Random;

public class List {

    public static void main(String[] args) {

        Random random = new Random(100);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100));
        }
        for (int elem: arrayList) {
            System.out.print(elem +"  ");
        }
        arrayList.clear();
        System.out.println("\n" + "List cleared.");
    }
}
