package homeworks.methods;


public class Calculator {

    public static void main(String[] args) {
        Calculator calculation = new Calculator();
        int a = 21;
        int b = 3;
        int sum = calculation.addNumbers(a, b);
        System.out.println(sum);
        double dividing = calculation.divideNumbers(a, b);
        System.out.println(dividing);
        int multiplying = calculation.multiplyNumbers(a, b);
        System.out.println(multiplying);
        int minus = calculation.subtractNumbers(a, b);
        System.out.println(minus);

    }

    public int addNumbers(int a, int b) {
        return a+b;

    }

    public double divideNumbers (int a, int b) {
        return (double)a / b;

    }
    public int multiplyNumbers (int a, int b) {
        return a * b;

    }
    public int subtractNumbers (int a, int b) {
        return a - b;
    }
}
