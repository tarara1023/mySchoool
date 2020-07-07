package myextras.interviewTasks;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong (int num) {
        int sum = 0;
        int obj = num;
        int digit = 0;
        while (num > 0) {
           digit = num %10;
           sum += digit*digit*digit;
            num /= 10;

        }

        return sum == obj;
    }



}
