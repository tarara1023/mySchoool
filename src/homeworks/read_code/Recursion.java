package homeworks.read_code;

public class Recursion {

    public static void main(String[] args) {
        int number = 20;
        int sum = myNumber(number);
        System.out.println(sum);
    }
    public static int myNumber(int num) {
        if (num != 0)
            return num + myNumber(num-1);
        else return num;
    }
}
