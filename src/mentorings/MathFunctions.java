package mentorings;

import java.util.Scanner;

public class MathFunctions {

    public static void main(String[] args) {
        //widely used Math functions
    /*
    Task #1
    Step 1. Ask user to input any number
    Step 2. Display the square root of that number
    Example: Please enter a number: 16
    The square root of 16 is 4
    Hint: use Math.sqrt(double a)
     */
        Scanner  input = new Scanner(System.in);

        System.out.println("Enter number to display the square root og in: ");
        double num = input.nextDouble();

        double result = Math.sqrt(num);

        System.out.println("The square root of " + num + " is " + result);
        
    /*
    Task #2
    Step 1. Ask user to input 3 numbers
    Step 2. Display the maximum number entered
    Example: Please enter 3 numbers: 4 7 23
    Output: The maximum number is 23
    Hint: use Math.max(int a, int b)
     */

        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = input.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Max number of three is " + max);
    /*
    Task #3
    Step 1. Ask user to input the base number
    Step 2. Ask user to input the power number
    Step 3. Display the result of base number taken to the power of power number
    Example: Enter base number: 2
            Enter power number: 3
            Output: 2 to the 3rd power is 8
            Hint: 2 to the 3rd power is 2 * 2 * 2 = 8
            use Math.pow( int a, int b)
     */
        System.out.println("Enter base number: ");
        int baseNumber = input.nextInt();
        System.out.println("Enter power number: ");
        int powerNumber = input.nextInt();
        double power = Math.pow(baseNumber, powerNumber);
        System.out.println(baseNumber + " to the " + powerNumber + " power is " + power);

    /*
    Task # 4
    Generate a random 1 digit number
    Generate a random 2 digit number
    Generate a random 3 digit number
    Hint: use Math.random() - it returns a number between 0.0 and 1
     */

    int random =  (int)(Math.random() * 10);
    int random2 =  (int)(Math.random() * 100);
    int random3 =  (int)(Math.random() * 1000);
        System.out.println(random);
        System.out.println(random2);
        System.out.println(random3);


        //Task #5
        int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--; //
        System.out.println("k = " + k);
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        //Task #6
        int a = 7;
        int b = 10;
        int c = a++ + ++b; // c = 18  a = 7 b = 11
        int d = --a + --b + c--; // d = 35 a = 7 b = 10 c = 18 // c is 17 for next line
        int e = a + ++b + c++ + d--;//e = 70 a = 7 b = 11 c = 17 d = 35 // c=18, d =34
        int f = -a + b-- + -c - d++;// f = -48 a = -7 b = 11 c = -18 d = 34 // b=10, d = 35
        int sum = a + b + c + d + e + f; // 7 + 10 + 18 + 35 + 70 - 48;
        System.out.println("sum = " + sum); //92
    }

}
