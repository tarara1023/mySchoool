package sessions.collections.arrays;

import java.util.Scanner;

public class ArraysClass1 {

    public static void main(String[] args) {

        //Have the name of first 5 students in the zoom
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        String[] studentsNames = new String[5];//5 --> 0,1,2,3,4
        System.out.println(studentsNames[0]); //null -> as a default value for string and
                                                //non primitive data types
                                               //int -> 0, double -> 0.0, boolean -> false
        studentsNames [0] = "Elon Musk";
        System.out.println(studentsNames[0]);
        studentsNames [1] = "Bill Gates";
        System.out.println(studentsNames[1]);
        studentsNames [2] = "Melanie Perkins";
        System.out.println(studentsNames[2]);
        studentsNames [3] = "Jeff Bezos";
        System.out.println(studentsNames[3]);
        studentsNames [4] = "John Doe";
        System.out.println(studentsNames[4]);

        studentsNames [1] = "Warren Buffet";

        System.out.println(studentsNames [1]);




        //
    }
}
