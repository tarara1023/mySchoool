package sessions.methods;

public class MethodReturnBoolean {

    public static void main(String[] args) {
        MethodReturnBoolean myObject = new MethodReturnBoolean();
//        boolean firstExample = myObject.isOldEnoughtToDrive(17);
//        System.out.println("Are you eligible to drive ? " + firstExample);
//        boolean second = myObject.isNumberEven(3);
//        System.out.println("Is number even " + second);
//        double third = myObject.calculateTheChange(200.40, 100);
//        System.out.println(third);

        myObject.useAllMethodsFromThisClass();


    }

    public boolean isOldEnoughtToDrive(int age) {

        boolean isOldEnought;

        if (age >= 18) {
            isOldEnought = true;
        } else {
            isOldEnought = false;
        }
        return isOldEnought;
    }

    public boolean isNumberEven(int num) {

        boolean isEven = num % 2 == 0;

        return isEven; // or return = num%2 ==0;

    }

    public static double calculateTheChange(double total, double cashReceived) {
        double change;
        if (total <= cashReceived) {
            change = cashReceived - total;
        } else {
            System.out.println("Not enough money");
            System.out.println("You need " + (Math.abs(cashReceived - total)));
            change = 0;

        }
        return change;

    }

    public  void useAllMethodsFromThisClass() {
        boolean firstExample = isOldEnoughtToDrive(17);
        System.out.println("Are you eligible to drive ? " + firstExample);
        boolean second = isNumberEven(3);
        System.out.println("Is number even " + second);
        double third = calculateTheChange(200.40, 100);
        System.out.println(third);
    }


}
