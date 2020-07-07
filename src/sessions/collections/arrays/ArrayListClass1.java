package sessions.collections.arrays;

import java.util.ArrayList;
//or we can delete 2 imports above and bring from import.util.*;

public class ArrayListClass1 {
    public static void main(String[] args) {
        //List - ArrayList
        // --LinkedList
        //Lists - is the collection which can store only
        //object, no primitives

        //ArrayList implemented using Array

        //1. List have a lot of handy methods
        //2. List are resizeable. We dont have to provide the size
        //When initializing our list.
        //So we can add as many elements.
        //as needed.

        //we need to import ArrayList from java.util packege;
        //1. import java.util.ArrayList; -> make only ArrayList available
        //2. import java.util.* - > wildcards(everything)
        //bring and make all of the classes in the util packege available
        //in this class.


        //What is the problem with array being fixed size?
        //1. we cannot add more elements than the given size.
        //ex: we have to be 100% sure how many elements we will have.
        //2. if we populatethe array with less elemets than its size
        //there will be a lot od default values hanging around.

        ArrayList namesList = new ArrayList();
        namesList.add("Elena");
        namesList.add(12);
        namesList.add(true);
        System.out.println(namesList);
        //compare to arrays we can just pass reference to Array List in the sysout
        //give an output similar to Arrays.toString(arr);



        ArrayList<String>colorsList = new ArrayList<String>(10);
        colorsList.add("Yellow");
        colorsList.add("Black");
        colorsList.add("Bluw");
        //but the size is not fixed arrayList will still be able to resize and grow .
        System.out.println(colorsList); //toString what println do


        ArrayList colorsListDupl = new ArrayList<>(colorsList);
        //copies the values from the list that we passed to the psrsms.
        System.out.println(colorsListDupl);

        //ArrayList<int> --> doesnt compile, dont support primitive data types.
        //Java provides wrapper classes for all primitives
        //Wrapper classes - object reprezentatiom of the primitive data types.
        //Integer i = 0;
        Integer num = new Integer(0);
        //literals - > this will convert primitive data type literals to Wrapper classes

        Integer i = 0; // (new Integer(0)) //prefered way
        //Integer i = 0 is preferred wat there is no cost to perfomance at all;
        int num2 = i;

        //whole process of being able to assign values from primitive to wrapper class and vice
        //verca is called autoboxing

        //Wrapper classes have methods.
        //Wrapper classes are immutable.

        //Wrapper classes are work around for not being able to store primitive data types in Collections
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(new Integer(100));
        nums.add(200);
        System.out.println(nums);

        ArrayList<Character> grades = new ArrayList<>();
        grades.add('c');
        grades.add('a');
        grades.add('b');
        System.out.println(grades);







    }
}
