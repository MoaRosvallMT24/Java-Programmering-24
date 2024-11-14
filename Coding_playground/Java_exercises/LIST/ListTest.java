package Coding_playground.Java_exercises.LIST;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Johan");
        names.add("Ida");
        names.add("Conny");
        names.add("Lurvas");
        names.add("Birk");
        
        System.out.println(names);

        names.add("Birk");

        System.out.println(names);

        names.remove("Birk");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<String> otherNames = new ArrayList<>();

        otherNames.add("Ophelia");
        otherNames.add("Hamlet");

        System.out.println(Collections.disjoint(names, otherNames));

        otherNames.add("Ida");

        System.out.println(Collections.disjoint(names, otherNames));

        int index = Collections.binarySearch(names, "Ida");

        System.out.println(index);

        Collections.swap(names, index, 0);

        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }

       
        
    }
}
