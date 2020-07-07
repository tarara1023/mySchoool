package sessions.collections.sets;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
//HashSet stores unique values and is unordered collection
        Set<String> plateNumber = new HashSet<>();
        plateNumber.add("FN01222");
        plateNumber.add("FNO111");
        plateNumber.add("FN01222");
        plateNumber.add("CHI312");
        plateNumber.add("NYC998");
        plateNumber.add("SF100");
        plateNumber.add("CHI312");

        //output is only unique value in a random order
        System.out.println(plateNumber);

        //Create an list of countries for each student in DevX Summer2020.
        //Find me where are our students from? how many countries


        //LinkedHashSet stored unique values and is ordered by insertion order
        Set<String> plateNumber2 = new LinkedHashSet<>();
        plateNumber2.add("FN01222");
        plateNumber2.add("FNO111");
        plateNumber2.add("FN01222");
        plateNumber2.add("CHI312");
        plateNumber2.add("NYC998");
        plateNumber2.add("SF100");
        plateNumber2.add("CHI312");

        //outputs all unique values in the same order they were inserted.
        System.out.println(plateNumber2);


        //TreeSet is used to store unique values, and it orders the values by alphanumerical order
        Set<String> plateNumber3 = new TreeSet<>();
        plateNumber3.add("FN01222");
        plateNumber3.add("FNO111");
        plateNumber3.add("FN01222");
        plateNumber3.add("CHI312");
        plateNumber3.add("NYC998");
        plateNumber3.add("SF100");
        plateNumber3.add("CHI312");
        System.out.println(plateNumber3);

        //for each downside cannot modify the collection you are looping through
        //iterator can read all elements + edit the collection

        List<Integer> integerList = Arrays.asList(100,200,300,100,200,500,450,77,234,300,77);
        System.out.println(integerList);

        //convert unordered set to alphabetical ordered
        Set<Integer> uniqueNum = new HashSet<>(integerList);
        System.out.println(uniqueNum);

        plateNumber.remove("FN0111");
        System.out.println(plateNumber);

        if(plateNumber.isEmpty()) {
            System.out.println("No plates left");
        }else{
            System.out.println("We have " + plateNumber.size() + " plates available");
        }

        if(uniqueNum.contains(100)) {
            uniqueNum.remove(100);
        }
        System.out.println(uniqueNum);


        //Set doesnt have get by index method. So we are unable to get the values based in positions
        //How do we access the elements in Set?
        //1. using for each loop for reading only (cant use regular for loop, cause ni indexes)
        //2. using iterator for reading and modifying the collection we are looping through

        for (Integer num: uniqueNum) {
//            uniqueNum.add(200);
            //ConcurrentModificationException -> save this example for the question of exeptions
            System.out.print(num + " ");
        }
        System.out.println();

        //Iterator is a mechanism which allows us to iterate through the collections.
        //Iterator is also a collection od elements.
        Iterator <Integer> iteratorUniqueNumber = uniqueNum.iterator();

        //unknown number of elements.
        //iterator provides as a method which checks if we have a next value. hasNext() method-> return true or false

        while(iteratorUniqueNumber.hasNext()) {
            int num = iteratorUniqueNumber.next();
            if(num == 200) {
                iteratorUniqueNumber.remove();
           }

        }
        System.out.println(uniqueNum);

        if(uniqueNum.contains(200)) {
            uniqueNum.add(222);
        }
        System.out.println(uniqueNum);


        //in order to use iterator twice we have to make sure to create a new iterator, bc the previous
        //while loop moved the iterator pointer to the end.
        iteratorUniqueNumber = uniqueNum.iterator();

        //removeAll(collection) -> removes all elements
        //what is the differenece removeAll and clear?
        //clear() -> removes all elements in the collection
        //removeAll(collection) will remove all elements which are present in the given colloction param the the set
        //with remove all we are choosing multiple values to be removed
        //if the collection that we are passing to remove all contains a value not present in the original collection
        List<Integer> num = Arrays.asList(777, 55, 22);
        uniqueNum.removeAll(num);

        System.out.println(uniqueNum);

        //addAll(Collection) -> adds values in the collection that is being in param
        //to the collection which we are calling the addAll method from
        Set<Integer> numSet = new HashSet<>(Arrays.asList(99, 11, 23));
        uniqueNum.addAll(numSet);
        System.out.println(uniqueNum);






















    }
}

