package sessions.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {
    public static void main(String[] args) {
        Set<String> str9 = new HashSet<>();
        str9.add("James");
        str9.add("Joe");
        str9.add("Linda");
        str9.add("James");
        str9.add("Ola");
        str9.add("Joe");
        System.out.println(str9);

    //Provide the same type for iterator that is the type of the collection
        //you iterate thru
        Iterator<String> iterator = str9.iterator();
        System.out.println(iterator.hasNext()); //returns boolean
        System.out.println(iterator.next()); //returns element
        // hasNext() returns true if iterator has a next element
        //1-true, 2-true, 3, true, 4 false (no elements after)
        for (String s: str9) {
            System.out.println(s.toLowerCase());
        }
        while (iterator.hasNext()) {
            String curr = iterator.next();//next element of iteratiom

            if (curr.equals("James"))
            iterator.remove();
            //Method of an iterator that will remove an element of a current
            //removing based on the position
            //if just set.remove we shoud know value

            //you cannot use same iterator
            //have to create new, or reasing
            iterator = str9.iterator(); //reasining iterator;
        }


    }
}
