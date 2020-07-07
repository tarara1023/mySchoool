package homeworks.loops;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Number: ");
        int n = inp.nextInt();
        System.out.println(fib(n));

    }

    public static int fib(int n) {

        int f[] = new int [n+1];

        for (int i = 2; i <= n; i++) {
            f[0] = 0;
            f[1] = 1;
            f[i] = f[i - 1] + f[i - 2];


        }

        System.out.println("fibonacci: " + Arrays.toString(f));
        return f[n];
    }
}
