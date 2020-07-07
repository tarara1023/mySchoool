package mentorings;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Task2 {

    public static void main(String[] args) {

      int a = 7;
      int b = a * 3;
      int c = (a + b) * 2;
      int d = c % 10; //last digit

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }


}

class Task2A {

    public static void main(String[] args) {

        int a = 1234;
        System.out.println(a%10);
        a/=10;
        System.out.println(a%10);
        a/=10;
        System.out.println(a%10);
        a/=10;
        System.out.println(a%10);

    }
}

class Task2B {
    public static void main(String[] args) {

        int seconds = 300;
        System.out.println("How many seconds and min left");
        int min = seconds / 60;
        seconds %=60;
        System.out.println(min + ": " + seconds);

    }
}

class Task2C {
    public static void main(String[] args) {

        int second = 8799;
        // seconds in 1 day 86400
        //3600 in 1 hr;

        int days = second / 86400;
        second %= 86400;
        int hrs = second / 3600;
        second %= 3600;
        int min = second / 60;
        second %= 60;
        System.out.println(days + ":" + hrs + ":" + min + ":" + second);


    }

}

class Task2D {

    public static void main(String[] args) {

        int pennies = 10000;
        //quarter = 25;
        //dime = 10pennies;
        //nickels = 5;

        int HundredDollarBills = pennies / 10000;
        pennies %= 10000;
        int fiftyDollarBills = pennies / 5000;
        pennies %= 5000;
        int twentyDollarBills = pennies / 2000;
        pennies %= 2000;
        int tenDollarBills = pennies / 1000;
        pennies %= 1000;
        int fiveDollarBills = pennies / 500;
        pennies %= 500;
        int oneDollarBill = pennies / 100;
        pennies %= 100;
        int quarter = pennies / 25;
        pennies %= 25;
        int dime = pennies / 10;
        pennies %= 10;
        int nickels = pennies / 5;
        pennies %= 5;

        System.out.print(HundredDollarBills + "." +fiftyDollarBills + "." + twentyDollarBills + "." + tenDollarBills + "." + fiveDollarBills);
        System.out.println("."+ oneDollarBill + "." + quarter + "." + dime + "." + nickels + "." + pennies);



    }
}