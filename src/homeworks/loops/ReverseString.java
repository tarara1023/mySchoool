package homeworks.loops;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.next();
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {

            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
