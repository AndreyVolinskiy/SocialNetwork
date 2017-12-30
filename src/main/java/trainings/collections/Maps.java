package trainings.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "kdjfn");
        map.put(2, "dth");
        map.put(3, "kdjfn");
        map.put(4, "kddthdgfhj");
        map.put(5, "kd546dth");

        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();

        System.out.println(map);
    }
}
