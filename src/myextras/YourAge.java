package myextras;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class YourAge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year ");
        int year1 = input.nextInt();
        System.out.println("Enter your month");
        int month1 = input.nextInt();
        System.out.println("Enter your day");
        int day1 = input.nextInt();
        System.out.println(getAge(year1, month1, day1));


    }

    private static int getAge(int year1, int month1, int day1) {
        int year = LocalDateTime.now().getYear();
        int month = LocalDateTime.now().getMonthValue() ;
        int day = LocalDateTime.now().getDayOfMonth();

        int age = year - year1;

        if ((month1 > month) || (month == month1 && day1 > day)) {
            --age;
        }
        return age;





    }
}
