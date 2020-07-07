package homeworks;

public class Practice2 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 50;
        int temp = num1;
        num1 = num2;
        num2 = temp;



        System.out.println("num1: " + num1); //=>50;
        System.out.println("num2: " + num2); //=>10;

    }
}
