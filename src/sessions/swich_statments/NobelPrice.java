package sessions.swich_statments;

import java.util.Scanner;

public class NobelPrice {

    public static void main(String[] args) {
        //write a program which will tell me if I qualify
        //for a nobel Prize

        //ONE QUALIFIES for nobel prize when
        //one does Significan Work
        //is nobelPrize candidate

        //ask the user did you do significant work?
        //are you a nobelPrize Candidate?

        Scanner input = new Scanner(System.in);

        System.out.println("Did you do significant work?");
        boolean doesSignificantWork = input.nextBoolean();
        System.out.println("Are you a make Break through?");
        boolean makesBreakthrough = input.nextBoolean();

        boolean nobelPrizeCandidate = false;

        if (doesSignificantWork && makesBreakthrough) {
            nobelPrizeCandidate = true;
        }
        else {
            nobelPrizeCandidate = false;
        }
        System.out.println("Is the user a nobel prize candidate? " + nobelPrizeCandidate);








    }
}
