package sessions.if_then;

public class if_else {

    //Find a Positive or Negative
    public static void main(String[] args) {

        int userGivenNumber = 10;

        if (userGivenNumber > 0) {
            System.out.println("Number is positive ");
        }else{
            System.out.println("Number is negative ");
        }

        int age = 18;

        if (age >=18) {
            //Send them an email. send them a mail.
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("Not eligible To vote yet");
            int yearsToWait = 18 - age;
            System.out.println("You have to wait for " + yearsToWait + " more years");
        }
        if (age >= 18) {
            System.out.println("vote");
        }
    }
}
