package homeworks.loops;

import java.util.Scanner;

public class AddingValueinALoop {

    public static void main(String[] args) {

        //Write a program that gets several integers from the user.
        // Sum up all the integers they give you. Stop looping when
        // they enter a 0. Display the total at the end.
        //
        //You must use a while loop.

                Scanner sc = new Scanner(System.in);
                int i = 0;
                int num;
                int total = 0;
                boolean yesOrNo = true;
                while (yesOrNo){
                    System.out.println("Enter number: ");
                    num = sc.nextInt();
                    total+= num;
                    System.out.println("the total so far is: " + total);
                    if (num == 0){
                        yesOrNo = false;
                    }
                }
                System.out.println("the total is : " + total);
            }
        }







