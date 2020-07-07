package sessions.if_then;
//Write a program to see if the user is eligible to work
//users under 18 cannot work
//users over 60 cannot work
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        int minimumRequiredAgeToWork = 18;
        int over60 = 60;
        if (age < minimumRequiredAgeToWork) {
            System.out.println("You are a minor");
            System.out.println("Not Eligible To Work Yet");
        } else if (age >= minimumRequiredAgeToWork && age <= over60) {
            System.out.println("You are Eligible to Work");
            System.out.println("Please fill in your details and apply");
        } else if (age > over60 && age <= 130) {
            System.out.println("You are too old to work as per the Government rules");
            System.out.println("Please Collect your pension!");
        }
        else {
            System.out.println("Unreal Age! No Human");
        }
        //Simplify
        if (age < minimumRequiredAgeToWork && age > 0) {
            System.out.println("You are a minor");
            System.out.println("Not Eligible To Work Yet");
        } else {
            if (age >=18 && age <= 60) {
                System.out.println("You are Eligible to Work");
                System.out.println("Please fill in your details and apply");
            }
            else if(age > over60 && age <= 130){
                System.out.println("You are too old to work as per the Government rules");
                System.out.println("Please Collect your pension!");
            }
            else {
                System.out.println("Unreal Age! No Human");
            }
        }
        //Login Functionality
        //If user inputs right userName
        //then ask for password
        String savedUserName = "WindyCity";
        String savedPassword = "VeryHardPass123";
        System.out.println("Please Enter User Name");
        String userName = input.next();
        //When working with Strings there is always a need to compare two Strings.
        //Nested If Statement
        //If statements inside another if statement.
        //Outer if statements
        if (userName.equalsIgnoreCase(savedUserName)) {
            System.out.println("Please Enter Password");
            String password = input.next();
            //inner if statement
            if (password.equals(savedPassword)){
                System.out.println("You are logged in");
            } else {
                System.out.println("Wrong Password");
                System.out.println("Please try again");
            }
        } else {
            System.out.println("UserName Doest Exist");
        }
        //switch statements
    }
}

