package homeworks.loops;

public class SumRunningInt {
      // Save as "SumRunningInt.java"
        public static void main (String[] args) {
            // Define variables
            int sum = 0;          // The accumulated sum, init to 0
            int lowerbound = 1;
            int upperbound = 100;

            // Use a for-loop to sum from lowerbound to upperbound
            for (int number = lowerbound; number <= upperbound; ++number) {
                sum += number;


            }
            System.out.println("The sum of: " + lowerbound + " to " + upperbound + " is " + sum);

        }
    }

