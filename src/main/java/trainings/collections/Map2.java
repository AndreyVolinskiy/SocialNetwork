package trainings.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Map2 {

    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();

        map.put(1, "dghb");
        map.put(2, "ghjmdfg");
        map.put(3, "e4gerg");
        map.put(4, "r6yjt7j");
        map.put(5, "e5theh");
        map.put(6, "ryjrtuj");
        map.put(7, "ethe4rg");
        map.put(8, "ejry6j");
        map.put(9, "eheg");
        map.put(10, "21r3546");
        map.put("w3fw4g", 11);
        map.put("r6jtk", 12);
        map.put("wq3gw4g", 13);
        map.put("t7k6y6k", 14);
        map.put("wg4wg", 15);
        map.put("k57tk77k", 16);
        map.put("e5hr6j", 17);
        map.put("ehr6jr6", 18);
        map.put("e5hr6j", 19);
        map.put("he5he5h", 20);

        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Object> keys = new ArrayList<>();
        ArrayList<Object> values = new ArrayList<>();

        keys.addAll(map.keySet());
        values.addAll(map.values());


        for (Object object : keys) {
            if (object instanceof Integer) {
                integerArrayList.add((Integer) object);
            }
            if (object instanceof String) {
                stringArrayList.add((String) object);
            }
        }

        for (Object object : values) {
            if (object instanceof Integer) {
                integerArrayList.add((Integer) object);
            }
            if (object instanceof String) {
                stringArrayList.add((String) object);
            }
        }

        System.out.println(integerArrayList);
        System.out.println(stringArrayList);

    }
}
