package mentorings;

import java.util.Scanner;

public class MentoringMariannaB {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter Total seconds: ");
            int hours, minutes, remainingSeconds,seconds, seconds2;

            seconds = input.nextInt();
            hours = seconds / 3600;
            System.out.println(hours);
            remainingSeconds = seconds % 3600; // 8000 / 3600 = 2Hours + remainingSeconds(800seconds).
            minutes = remainingSeconds / 60;  // 800seconds / 60seconds = 13minutes + remainingSeconds.
            System.out.println(minutes);
            seconds2 = remainingSeconds % 60; //
            System.out.println(seconds2);
        }
}
