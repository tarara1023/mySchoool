package sessions.loops;

public class Continue {

    public static void main(String[] args) {

        //continue - jumps to the next loop, by skipping
        //the remaining comments after the continue statement.

        for (int i = 0; i < 10; i++) {
            if (i == 2)
            continue;
            System.out.println("Hello" + i) ;
        }

        //print me out numbers that are divisible by 2

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }

        //continue is used to skip some part  of the loop
        String [] arr = {"Male", "Female", "Male", "Female", "Male", "Female", "Female"};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Male")) {
                continue;
            }
            System.out.println("Congratz dear ");
        }


        //write a program which will print out all numbers between 0-100
        //accept 10th,20th,30,40 etc

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0)
                continue;
            System.out.println(i);
        }

        //write a program which will print out all numbers starting 100 - 0
        //skip 9th,19,29,9..

        for (int i = 100; i > 0; i--) {
            if (i % 10 == 9)
                continue;
            System.out.println(i);
        }

        // 2020 --> sports that there is no champion in this year.
        //
        for (int i = 2000; i < 2020; i++) {
            if (i == 2007) {
                System.out.println("There was no champion in this year due to");
                continue;
            }
            System.out.println("Champion of " + i + " some team name");

        }



    }
}
