package sessions.operators;

public class ArithmeticOperators {


    //Arithmetic operators will help us to do meth in Java
    //Add tow numbers etc.
    public static void main(String[] args) {

        //add two number and give result
        //hardcoding - giving the exact values in output
        System.out.println("Addition");
        System.out.println(10 + 15);
        System.out.println(1000 + 3242);
        System.out.println(10 + "" + 15);

        // Subtraction (minus)
        System.out.println("Subtraction");
        System.out.println(160 - 60); //100
        System.out.println(2000 - 200); //1800

        System.out.println("Multiplication");
        //Multiplication
        System.out.println(300 * 20);//6000
        System.out.println(1 * 2003); //2003

        //Division
        System.out.println("Division");
        System.out.println(1400 / 2); //700
        System.out.println(333 / 3); //111

        //Modulo -- gives me REMAINDER of my division
        System.out.println("Modulo");
        System.out.println(10 % 2); //0
        System.out.println(55 % 2); //1
        System.out.println(44 % 3); //2

        System.out.println(56 % 20);
        //even number --- number that is divisible by 2 without any remainder, remainder = 0
        // Odd number -- number that is not divisible by 2. When divided result will have a remainder.
        System.out.println(42 % 2); //42 is even bc remainder is 0 and we are dividing by2
        System.out.println(43 % 2); //43 is odd number bc we dividing it by 2 and getting remainder as 1


        //Be Careful with double quotes bc they make number as String(text)
        System.out.println("bfje" + 10 + 15);

        System.out.println("How do I find percentage if % is modulo?");
        //Find the 12% discount of $100 item
        System.out.println(100*12/100);
        //Find 44% discount of $1200
        System.out.println(1200*44/100);



    }
}










