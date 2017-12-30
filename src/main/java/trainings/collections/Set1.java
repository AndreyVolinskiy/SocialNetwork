package trainings.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set1 {


    public static void main(String[] args) {

        ArrayList listOfStrings = new ArrayList<>();
        ArrayList newListOfStrings = new ArrayList<>();
        ArrayList listOfIntegers = new ArrayList<>();
        ArrayList newListOfIntegers = new ArrayList<>();
        Set<String> setOfStrings = new HashSet<>();
        Set<Integer> setOfIntegers = new HashSet<>();

        listOfStrings.add("aaaaaaa");
        listOfStrings.add("aaaaaaa");
        listOfStrings.add("aaaaaaa");
        listOfStrings.add("aaaaaaa");
        listOfStrings.add("aaaaaaa");
        listOfStrings.add("bbbbbbb");
        listOfStrings.add("ccccccc");
        listOfStrings.add("ddddddd");
        listOfStrings.add("eeeeeee");
        listOfStrings.add("fffffff");
        System.out.println(listOfStrings);
        setOfStrings.addAll(listOfStrings);
        System.out.println(setOfStrings);
        newListOfStrings.addAll(setOfStrings);
        System.out.println(newListOfStrings);

        listOfIntegers.add(1);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(6);
        listOfIntegers.add(1);
        listOfIntegers.add(1);
        listOfIntegers.add(1);
        listOfIntegers.add(1);
        listOfIntegers.add(1);

        System.out.println(listOfIntegers);
        setOfIntegers.addAll(listOfIntegers);
        System.out.println(setOfIntegers);
        newListOfIntegers.addAll(setOfIntegers);
        System.out.println(newListOfIntegers);


    }
}
