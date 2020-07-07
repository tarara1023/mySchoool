package sessions.collections.arrays;

import java.util.Scanner;

public class ArraysClass2 {
    public static void main(String[] args) {
        //size of an array must be given in integer

        Scanner sc = new Scanner(System.in);
        String [] farm = new String [5];
        System.out.println(farm[0]);
        farm [0] = "monkey";
        System.out.println(farm[0]);
        farm[1] = "Horse";
        farm [2] = "chimp";
        farm [3] = "parrot";
        farm [4] = "snake";
        System.out.println(farm[3]);
        System.out.println(farm); //hashcode --> location in the heap(memory)

        //farm[4] will ask what do you have in the room(cell) number 4
        //result will be given and the element in the cell will still be there
        String snake = farm[4]; // String snake = "Snake";
        System.out.println(snake);

        System.out.println(farm[4].substring(farm[4].indexOf("n")));

        //initialization second approach
        //5 elements but counting from 0, leo ->4

        //Compile time error - errors that dont allow us compile the code
        //from  .java to .class bytecode
        //Thus we are unable to run the program

        //Runtime exeptions are the error that occur only while program is runninf
        //Java doesnt know if error
        String [] farmArr = {"monkey", "horse", "chimp", "parrot", "leo"};
        System.out.println(farmArr[4]);

        System.out.println(farm.length); //the only method that we use in arrays
        //Task to print out all of the values from arrays with just one System.out
        for (int i = 0; i < farm.length; i++) {
            System.out.println(farm[i]);
        }







    }

}
