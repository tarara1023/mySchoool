package homeworks.loops;

import com.sun.corba.se.impl.legacy.connection.USLPort;

import java.util.Scanner;

public class NTermsOfOddNumberAndSum {

    public static void main(String[] args) {

        System.out.println("Please enter number of terms: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {


            System.out.println(i*2-1);
            sum += i*2-1;
        }
        System.out.println("The sum of odd Natural Number up to terms is: " + sum);
    }
}
