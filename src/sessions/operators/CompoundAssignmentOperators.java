package sessions.operators;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 50;

        num1 = num1 + num2; // = the right side is executed first.

        num2 = 110 + num1;

        System.out.println(num1);

        num2 = num2 + 20; // 190
        System.out.println(num2);

        //When ypu are seeing the variable that you are trying to reassign the
        //value of in the right side of the = sign.

        double balance = 10000.00;
        int totalSpending = 0;
        totalSpending = 100;
        totalSpending = totalSpending + 50; //150
        totalSpending = totalSpending + 25; // 170
        totalSpending = totalSpending + 700;//875
        balance = balance - totalSpending;


        System.out.println("Balance: " + balance);


// Compound assignment operators
        totalSpending = 0;
        totalSpending += 100;
        totalSpending += 200;
        System.out.println(totalSpending);

        balance -= totalSpending;

        System.out.println("Balance: " + balance);

        // passive income

        int passiveIncome = 1;

        passiveIncome = passiveIncome * 2;

        passiveIncome *= 2;

        passiveIncome *= 2;

        System.out.println("Passive Income: " + passiveIncome);

        //division

        int number = 500;
        number /= 2;
        number /= 2;

        System.out.println(number);
















    }
}
