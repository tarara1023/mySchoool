package sessions.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NewClassSets {

    public static void main(String[] args) {
        Set <String> set = new HashSet<>(Arrays.asList("Antony Blenivs", "John Doe", "Rylan Foster", "tori"));
        Set <String> set2 = new HashSet<>(Arrays.asList("Antony Blenivs", "John Doe", "Rylan Foster", "Rolando Monroe", "Lola Lokki"));

//        set.retainAll(set2); //retain method will update the set that called the method and keep only intersection of caller set
        // ans set that was provided
        System.out.println(getMutualElements(set, set2));
        System.out.println(set);
        System.out.println(set2);




    }

    public static Set<String> getMutualElements (Set<String> s1, Set <String> s2) {

        Set <String> res = new HashSet<>(s1);
        res.retainAll(s2);

        return res;
    }

    public static boolean containsAll () {

        Set <String> set = new HashSet<>(Arrays.asList("Antony Blenivs", "John Doe", "Rylan Foster", "Rolando Monroe"));
        Set <String> set2 = new HashSet<>(Arrays.asList("Antony Blenivs", "John Doe", "Rylan Foster", "Rolando Monroe", "Lola Lokki"));

        System.out.println(set2.containsAll(set));
        //containsAll expexts another set, check if current set contains all the elements
        //from a provided set

        System.out.println(set.containsAll(set2));


         return true;
    }

    public static void lambda() {

        Set <String> set = new HashSet<>(Arrays.asList("Antony Blenivs", "John Doe", "Rylan Foster", "Rolando Monroe"));

        set.forEach(System.out::println); //LAMBDA - for each method of collection
        //in this case only providing element

        set.forEach(x -> System.out.println(x));  //similar to for each loop declare x as reference
        //to each element of a collection
        // -> syntax, method after arrow will be called for each element




    }
}
