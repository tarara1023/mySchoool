package homeworks;

import java.util.Scanner;

public class AcceptApllicantForInterview {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your years in college ");
        int yearsInC = input.nextInt();
        System.out.println("Enter your years of programming experience ");
        int yearsOfP = input.nextInt();
        System.out.println("Enter your GPA ");
        double gPA = input.nextDouble();
        AcceptApllicantForInterview myObject = new AcceptApllicantForInterview();

        boolean accepted = myObject.acceptation(yearsInC, yearsOfP, gPA);
        System.out.println(accepted);

    }

    public boolean acceptation (int yearsInC, int yearsOfP, double gPa) {
        return yearsInC >=4 && (yearsOfP >=2 || gPa >= 3.5);
    }
}
