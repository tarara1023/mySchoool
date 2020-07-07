package mentorings;

import java.util.Scanner;

public class Lotery {
    public static void main(String[] args) {


    /*
    Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
Note the digits of a two-digit number may be 0. If a number is less than 10, we assume that
the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated
as 08, and number 0 is treated as 00 in the program.
Example 1:
Enter your lottery pick (two digits): 15
The lottery number is 15
Exact match: you win $10,000
Example 2:
Enter your lottery pick (two digits): 45
The lottery number is 54
Match all digits: you win $3,000
Example 3:
Enter your lottery pick: 23
The lottery number is 34
Match one digit: you win $1,000
Example 4:
Enter your lottery pick: 23
The lottery number is 14
Sorry: no match
     */
        Scanner input = new Scanner (System.in);
        System.out.println("Guess a number: ");
        int guessedNumber = input.nextInt();
        int lotteryNumber = (int) (Math.random()*100);
        int guessedFirstDigit = guessedNumber / 10;
        int guessedSecondDigit = guessedFirstDigit % 10;
        int lotteryFirstDigit = lotteryNumber / 10;
        int lotterySecondDigit = lotteryNumber % 10;

        if (guessedNumber == lotteryNumber) {

            System.out.println("Exact match: $10 000");
        } else if (guessedFirstDigit == lotterySecondDigit && guessedSecondDigit == lotteryFirstDigit) {

            System.out.println("Digits match: $3000");
        }
        else if (guessedFirstDigit == lotteryFirstDigit || guessedFirstDigit == lotterySecondDigit || guessedSecondDigit == lotteryFirstDigit || guessedSecondDigit == lotterySecondDigit) {

            System.out.println(" You win $1000");

        }else {
            System.out.println("There is no win");
        }














    }
}