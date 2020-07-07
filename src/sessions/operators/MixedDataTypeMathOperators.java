package sessions.operators;

public class MixedDataTypeMathOperators {

    public static void main(String[] args) {

        System.out.println(100/1.0); //converts 1.0 to double
        //then carries out division of 100.0/1.0

        int result = 250/(int)2.0; // or int result = (int)(250/2.0);

        System.out.println(result);

        double result2 = (double)9 / 5 * 20.1;

        System.out.println(result2);
    }
}
