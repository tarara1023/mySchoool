package homeworks;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter letter ");
        char inChar = in.next().toLowerCase().charAt(0);
        PhoneKeyPad myObject = new PhoneKeyPad();
        int phone = myObject.phoneKeyPad(inChar);
        System.out.println(phone);
        String title = "Senior SDET []";
        title = title.substring(title.indexOf("]"));
        System.out.println(title);

    }

    public int phoneKeyPad (char inChar) {

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
    public void stahf () {
        String title = "Senior SDET []";
        title = title.substring(0, title.indexOf("]"))+ title.substring(title.indexOf("]"));
    }
}
