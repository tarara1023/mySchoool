package myextras.interviewTasks;

import sun.jvm.hotspot.utilities.soql.JSJavaVM;

import java.util.Arrays;

public class FibonacciSum {
    static final int MAX = 100005;

    /**
     * Check each element in an array if its fibonachi numbers if found, add to temp variable, and then the sum of it check if  its fibonachi?
     * fibonachi numbers are : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025
     * <p>
     * Input: arr[] = {2, 3, 9, 15, 22}
     * 2 + 3 = 5 then check if 5 is a fibonachi numbers true
     * Input: arr[] = {1, 2, 3, 5, 8};
     * 1+2+3+5+8 = 19 no
     * Third message “try small numbers ma man” if its more than MAX
     * Output: Yes
     * Explanation:
     * Yes, as there are two Fibonacci numbers in the array i.e. 2 and 3.
     * So, the sum of Fibonacci numbers is 2 + 3 = 5 and 5 is also a Fibonacci number.
     * Input: arr[] = {1, 2, 3}
     * Output: No, because sum of 1+2+3=6 which is not a Fibonachi number
     */

    public static void main(String[] args) {
        int arr[] = {2, 3, 9, 15, 22, 5};
        int srr[] = {1,2,3, 5};
        System.out.println(isFibonacci(arr));
        System.out.println(isFibonacci(srr));
    }
    public static boolean isFibonacci(int[] arr) {
        int[] fib = new int[50];
  //here iam storing all fibonaci numbers
        for (int i = 2; i < 50; i++) {
            fib[0] = 0;
            fib[1] = 1;
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib));
        //here iam checking if in input array == to fib array and storing this numbers in sum of temp variable
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < fib.length; j++) {
                if (arr[i] == fib[j]) {
                    temp += arr[i];
                    break;
                }
            }
        }
        System.out.println("Sum of all fibonacci numbers in given Array: " + temp);
         //here iam checking if this sum is fibonacci
        for(int i = 0; i < fib.length; i++) {
            if(fib[i] == temp) return true;

        }
      return false;



    }


}



