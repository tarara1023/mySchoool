package sessions.operators.cimparissons;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        // ! - not --> negating. --> take the opposite

        System.out.println(!true);
        System.out.println(!false);

        // isEquals() dont create notEquals()
        // !contains() dont create doesNotContain();

        // Give some discount to unmarried people;
        Scanner input = new Scanner(System.in);
        System.out.println("Are you married?");
        boolean isMarried = input.nextBoolean();

        System.out.println("Are you married? " + isMarried);
        System.out.println("Should I give discount? " + !isMarried);

        int a = 10, b = 5, c = 1, result;
        result = a - ++c - ++b;
        System.out.println(result);


    }
}
