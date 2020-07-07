package sessions.collections.sets;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //Print all Prime numbers 0 - 100;
       Set<Integer> set = new HashSet<>(); //Creating an empty Hash se
       Set <Integer> set12 = new HashSet<>();
       Set<Integer> set2 = new LinkedHashSet<>();
       Set<Integer> set3 = new TreeSet<>();

       for(int i = 0; i < 100; i ++) {
           set.add(new Random().nextInt(100));
       }
        //SIZE
        System.out.println(set.size()); //return size of a set

        //REMOVE
        for(int i = 0; i < 100; i ++) {
            set12.add(i);
        }

        for (int i = 20; i < 30; i++) {
            set12.remove(i);
        }
        set12.remove(1);
        set12.remove(2);
        set12.remove(3);
        set12.remove(4);
        set12.remove(5);
        System.out.println(set12);

        //CLEAR
        set.clear();//Clear method removes all elements from the set
        System.out.println(set);
        //EMPTY
        System.out.println(set.isEmpty());//true/false checking if its empty

        Set<String> str9 = new HashSet<>();
        str9.add("James");
        str9.add("Joe");
        str9.add("Linda");
        System.out.println(str9);

        int i = 7;
        Integer j = 1;
        int i2 = j; //autoboxing
        calc(new Scanner(System.in));


    }
    public static void calc (Scanner c) {
        Set<String> listOfOperations = new HashSet<>(Arrays.asList("+", "-"));
                                               //List of operations that our calc can provide
        System.out.println("Enter a number:" );
        int i = c.nextInt();

        System.out.println("Enter a number:" );
        int i2 = c.nextInt();
        c.nextLine();

        String operator = "";

        do {
            System.out.println("Enter the oprator (+, -) ");
            operator = c.nextLine();
        }while(!listOfOperations.contains(operator)); //CONTAINS

        if (operator.equals("+")) System.out.println(i + i2);
        else System.out.println(i - i2);
    }



    public static void createSet() {
        Set <Integer> seet = new HashSet<>(); //Creating empty hash set
        List <Integer> ls = new ArrayList<>(); //Created an empty ArrayList
        ls.addAll(Arrays.asList(1,2,3,4,5,6,5,3,4,5));
        //adding values from a different list
        //Arrays.asList(arguments) consrtucts an immutable list with elements
        //that are provided
//        Arrays.asList(1,2,3,4,5,6).add(1);

        Set<Integer> set = new HashSet<>(ls);
        System.out.println(ls);

        System.out.println(set);


    }
}
