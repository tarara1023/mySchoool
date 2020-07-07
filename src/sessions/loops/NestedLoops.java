package sessions.loops;

public class NestedLoops {

    public static void main(String[] args) {
        int counter = 0;
        for (int outter = 1; outter <= 5; outter++) {
            System.out.println("outer loop" + outter);

            for (int j = 1; j <= 2; j++) {
                System.out.println(" inner = " + j);
                counter++;
            }
            counter++;

        }
        System.out.println(counter);

        //local variable
        //inner loop will run it self completely once for every iteration of the
        //outer
        //inner loop starts itself from beginning for every  iteration for the outer loop.

        //I want to print out
        //1
        //12
        //123
        //1234

        //Pseudocode => plan for your code.
        //verbal plan for your code
        //how many lines do we need to print out.
        //
        //number of lines is 4
        //for until 4 start from 1
        // every loop 1
        //

        String number = "";

        // # # # # #
        //  # # # # #
        // # # # # #
        //  # # # # #
        // # # # # #


        for (int row = 1; row <= 5; row++) {
            if (row % 2 == 0)
                System.out.print(" ");

            for (int column = 1; column <= 5; column++) {

                System.out.print("# ");
            }
            System.out.println();


        }

    }

}









