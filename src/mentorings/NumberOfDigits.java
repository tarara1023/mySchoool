package mentorings;

import java.util.Scanner;

public class NumberOfDigits {

//    Write a Java program that reads  positive integer
//    and count the number of digits the number (less than ten billion) has.
//    Test Data
//    Input an integer number less than ten billion: 125463
//    Expected Output :
//    Number of digits in the number: 6
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    long number = input.nextLong();

    System.out.print("Input an integer number less than ten billion: “");
    if(input.hasNextLong()){
        number = input.nextLong();
        if(number<0){
            number*=-1;
        }
        if (number>=10000000000L){
            System.out.println("Error message");
        }
    }else {
        int digits = 1;
        if (number >= 10 && number < 100) {
            digits = 2;
        }else if (number > 100 && number < 1000) {
            digits = 3;
        }else if (number > 100 && number < 1000) {

        }
    }




}
}
