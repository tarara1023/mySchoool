package sessions.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorNew {

    public static void main(String[] args) {

        Set<String> set2 = new HashSet<>(Arrays.asList("Mary Dean", "Bob Delan", "John Doe", "Sting King"));

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,3,5,8,7,9,7,6,5,4));
        Set <Integer> setEven = new HashSet<>();
        Set <Integer> setOdd = new HashSet<>();

        //Read only purpose
        //not updating set itself
        for (Integer i: set) {
            if (i % 2 == 0)
                setEven.add(i);
//            if(i == 8)
//                set.remove(i);
        }
        System.out.println(set);
        //Iterator read and update(remove);

        Iterator <Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 != 0)
                setOdd.add(i);
            if (i == 8)
                iterator.remove(); //doesnt take any parameters, thats why we use if statm
        }







        Iterator <String> iterator2 = set2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator2.next().toUpperCase());
        }

        //ORR

        for (String s : set2) {
            System.out.println(s.toUpperCase());
        }


    }
}
