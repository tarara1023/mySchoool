package homeworks.loops;
import  java.util.Scanner;
public class EnterPin {
    public static void main( String[] args )
    {

        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}

//1. While loop is similar to if statement, because they both check a boolean expression and maybe execute some code
//( entry != pin )
//2. While Loop give us opportunity to run a code multiple times
//3. Because we already assigned an int entry outside of while loop, because, we needed to input a pin,
//whether or not out expression gonna run or not, so in this case we could use do while loop
//4. Our program gonna run infinity times, because our entry = keyboard.nextInt(); was update statement
//5.
