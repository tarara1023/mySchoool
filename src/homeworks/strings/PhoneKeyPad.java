package homeworks.strings;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter letter: ");
        char inCHar = inp.next().toLowerCase().charAt(0);
        int phone = PhoneKeyPad.CHar(inCHar);
        System.out.println(phone);


    }
    public static int CHar (char inChar) {
        switch (inChar) {
            case 'a':
            case 'b':
            case 'c':
                return 2;
            case 'd':
            case 'e':
            case 'f':
                return 3;
            case 'g':
            case 'h':
            case 'i':
                return 4;
            case 'j':
            case 'k':
            case 'l':
                return 5;
            case 'm':
            case 'n':
            case 'o':
                return 6;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return 7;
            case 't':
            case 'u':
            case 'v':
                return 8;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return 9;
            default:
                return -1;

        }

    }

}
