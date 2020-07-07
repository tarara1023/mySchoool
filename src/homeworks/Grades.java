package homeworks;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your \"Math\" Grade");
        int math = input.nextInt();
        System.out.println("Please enter your \"History\" Grade");
        int history = input.nextInt();
        System.out.println("Please enter your \"Art\" Grade");
        int art = input.nextInt();
        System.out.println("Please enter your \"English\" Grade");
        int english = input.nextInt();

        int average = (math + history + art + english) / 4;

        if (average >= 80)
            System.out.println("Grade A");
        else if (average < 80 && average >= 60)
            System.out.println("Grade B");
        else if (average < 60 && average >= 40)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");
    }
}
