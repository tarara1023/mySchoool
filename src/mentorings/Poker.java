package mentorings;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter player cards");
        int playerCards = input.nextInt();
        System.out.println("Player Cards total" + playerCards);
        System.out.println("Please enter house cards");
        int houseCards = input.nextInt();
        System.out.println("House cards total" + houseCards);
        if (playerCards + houseCards > 21) { //1)
            System.out.println("The player Busts!");
        }
        if (houseCards > playerCards && houseCards <= 21) {
            System.out.println("The player losses!");
        }
        if (houseCards == playerCards) {
            System.out.println("Its a tie!");
        }
        if (playerCards > houseCards && playerCards <= 21) {
            System.out.println("Player Wins");
        }

    }

}
