package sessions.collections.arrays;

import java.util.*;

public class ArrayListt {

    public static void main(String[] args) {

        List<Integer>paymentAmount = new ArrayList();

//        paymentAmount.add("Mohamed"); //String
//        paymentAmount.add(true); //boolean

        //ADD METHOD - add item after the last item in the ArrayList
        paymentAmount.add(650);  //int /1
        paymentAmount.add(500);//2
        paymentAmount.add(100); //3
        System.out.println(paymentAmount);

        //Add defining the index, in place that we ll defing
        paymentAmount.add(0,250); //0
        paymentAmount.removeIf(x -> x < 200);
        System.out.println(paymentAmount);



        //REMOVE METHOD
        paymentAmount.remove(3);

        for(Integer i: paymentAmount) {
            System.out.println(i);
        }

        int indexOf = paymentAmount.indexOf(500); //find the index of given number
        System.out.println(indexOf); //asigning the index




        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(true);
        list.add('c');
        System.out.println(list);

        // SET METHOD - just changing the value
        paymentAmount.set(0,100);
        System.out.println(paymentAmount);

        //SIZE METHOD - same like length in Array
        int siz = paymentAmount.size();
        System.out.println("Size of array list is: " + siz);

        //CLEAR METHOD - makes your collection empty
       // paymentAmount.clear();

        //CONTAINS METHOD
        System.out.println(paymentAmount.contains(100));









    }
}
