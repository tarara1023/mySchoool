package homeworks.loops;

import java.util.Scanner;

public class CopiesString {

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));




    }
    public static String stringTimes (String word, int times) {
        String newWord = "";
        for (int i = 1; i <= times; i++)
            newWord += word;

        return newWord;
    }
}
