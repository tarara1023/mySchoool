package sessions.loops;

public class OptionalLabelAndBreaks {

    public static void main(String[] args) {
        //break statement can be used to stop(exit, terminate,
        //loop at any time

        //Print out Hello 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello" + i);
            break; //break statement terminates the loop (only this one)
                   //we can put return (end of method), but next program not gonna run
        }

        //you have stream of shoes. There are 100 of them, you need to choose one of the
        //based on a number

        for(int i = 1; i <=100; i++) {
            System.out.println("Loop number " + i);
            if (i == 25) {
                System.out.println("Great choice");
                break;
            }
            System.out.println("Loop number " + i + "end of the loop");
        }

        //Given a String print a program to print out each character of the String
        //until you see x.
        //ex: SpaceX
        // Space
        // DevX School
        // Dev
        String str = "SpaceX";
        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i) == 'X') {
                break;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //Write a program which will find me first number evenly divisible by 13.
        //number is between 0 and 100
        //break statement is needed when there is need to stop the loop before its ending
        //in which you want to stop the loop
        //break in loops will be wrapped inside if statement. 100%



        for (int i = 1; i <=100; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
                break;
            }

        }










    }
}
