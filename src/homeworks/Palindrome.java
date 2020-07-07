package homeworks;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter word: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(isPalindrome(str));



    }
    static boolean isPalindrome(String str)  {

            int i= 0, j= str.length() - 1;
            while (i < j) {

                if (str.charAt(i) != str.charAt(j))

                return false;

                ++i;
                --j;
            }

            return true;
        }
    }

