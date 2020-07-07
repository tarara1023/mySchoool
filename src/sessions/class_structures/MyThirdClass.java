package sessions.class_structures;
import homeworks.MuseFeelingGood;
import java.util.Random;
// This is last part of ClassStructures
//Explaining comments
public class MyThirdClass {

    /*
    Main method is a starting point of my java program.
    It has to be public static and void, must have (String[] args) {}
     */

    /*
    JDK - Java Development Kit(full of tools). JDK brings a lot of built in
    code witch we can use  to develop our program
     */



    public static void main(String[] args) {

        System.out.println("Testing random Class JDK");

        Random r = new Random(); // Random class come from java.util package. which is a part of JDK
        System.out.println(r.nextInt(10)); // r.nextInt(10) will give one random number between 0-9

        MuseFeelingGood s = new MuseFeelingGood ();
        System.out.println();



    }
}
