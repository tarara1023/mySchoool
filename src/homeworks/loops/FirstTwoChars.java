package homeworks.loops;

import java.util.Scanner;

public class FirstTwoChars {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        if (word.length() >= 3)
            System.out.println(word.substring(0,2));
        else
            System.out.println(word);

        }
    }

