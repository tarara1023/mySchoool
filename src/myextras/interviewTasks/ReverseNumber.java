package myextras.interviewTasks;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 345656;
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}
