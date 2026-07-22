package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDS {
    public static void main(String[] args) {

        HashSet<Integer>set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // size of the set
        System.out.println("Size is : "+set.size());

        // Search
        if(set.contains(6)){
            System.out.println("Present");
        }else {
            System.out.println("Absent");
        }

        // Iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+",");
        }
        System.out.println();

        // Empty function
        if(!set.isEmpty()){
            System.out.println("Set is not empty");
        }
    }
}
