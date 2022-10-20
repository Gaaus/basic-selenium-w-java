package lab_05;

import java.util.*;

public class lab_05_tmp {

    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(13);
        mySet.add(2);
        mySet.add(15);
        mySet.add(14);
        mySet.add(99);
        mySet.add(45);
        mySet.add(96);
        mySet.add(23);
        mySet.add(87);
        mySet.add(38);
        System.out.println(mySet);

        List<Integer> myList = new ArrayList<>(mySet);
        System.out.println(myList);
    }

}
