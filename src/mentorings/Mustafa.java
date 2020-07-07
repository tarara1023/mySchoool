package mentorings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mustafa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your five fav food: ");
        String [] list = new String [3];
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                System.out.println("No more memory available");
                break;
            }
            list[i] = input.nextLine();
            System.out.println(Arrays.toString(list));
        }
    }
}
