package sessions.string_methods;


import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        //equals => compare if two strings contain exact the same
        //characters. Note: Comparing the values of String.
            String str = "Hello";
            boolean isEqual = str.equals("Hello");
            System.out.println(isEqual);
            //write a program which tells me which side of the desk
            //student should sit.
            //if left handed then sit on the left Side
            //if right handed then sit on the right Side
            //if both take the full desk
            //equals() can be used to validate user's input
            Scanner sc = new Scanner(System.in);
            System.out.println("Which hand your strongest?");
            String hand = sc.nextLine();
            if (hand.equals("right")){
                System.out.println("Sit on the right side of the desk");
            }
            else if(hand.equals("left")){
                System.out.println("Sit on the left side of the desk");
            }
            else if(hand.equals("left and right")){
                System.out.println("take the full desk");
            }
            else {
                System.out.println("Not valid input");
            }
            System.out.println("What is your name");
            String name = sc.nextLine();
            System.out.println(name + " do you want to enter your full address?\nplease enter yes/no");
            String yesOrNo = sc.nextLine();

            if (yesOrNo.equals("yes")) {
                System.out.println("Please enter your full address");
                String address = sc.nextLine();
            }
            else if(yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("We appreciate your business with us");
            }
            else {
                System.out.println("Invalid Input");
            }


        }

    }


