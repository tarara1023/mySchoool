package sessions.collections.sets;

import java.util.*;

public class SetClass2 {

    public static void main(String[] args) {

        Set <String> set = new HashSet<>();
        //Add method ads an element to rhe hash set
        set.add("John Doe");
        List<String> list = Arrays.asList("Antony Blevins", "Nash Krueger", "Rylan Foster");
                            //List.of("", "", "");

        //Hash Set stores elements without a particular order
        Set<String> set2 = new HashSet<>(Arrays.asList("Mary Dean", "Bob Delan"));
        Set<String> setOnlyFutstName = new HashSet<>();
        Set<String> setofLastNames = new HashSet<>();
        set.addAll(list);
        set.addAll(set2);
        System.out.println(set);
        set.remove("John Doe");
        System.out.println(set);
        System.out.println(set.size());

        //isEmpty returns true if set is empty and false otherwise
//        System.out.println(set.isEmpty());

        //CONTAINS - main method
        //return true if its contains

        System.out.println(set.contains("yuliana"));
        System.out.println(set);


        Iterator<String> iterator = set. iterator();

        while (iterator.hasNext()) { //check if there is an element in front
            String curr = iterator.next(); // curr will be populated with new value with
            //each iteration
            //curr.substring(0, indexOf(" ");
            String [] arr = curr.split(" ");
            //split splits the String into separete elements by the element provided
            String furstName = arr[0]; //take first element from array
            //if we put arr[1] we ll take last name
            setOnlyFutstName.add(furstName); //store it in new Set

        }
        System.out.println(set);
        System.out.println(setOnlyFutstName);


        System.out.println(iterator.hasNext());

        Iterator <String> itertor2 = set.iterator();
        //orrr
        iterator = set.iterator(); //if we ll use oldone we gonna lose previose result

        System.out.println(iterator.hasNext());

        }














    }

