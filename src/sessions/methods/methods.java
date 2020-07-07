package sessions.methods;

public class methods {



    public void printSumOfTwoNums(int num1, int num2) {
        System.out.println(num1+num2);
    }

    public void wishMeLuck() {
        System.out.println("Wish me Luck");
    }
    public static void main(String[] args) {
        methods firstMethodClass = new methods();
        firstMethodClass.printSomething();
        firstMethodClass.printSomething();
        firstMethodClass.printHelloWorld();
        firstMethodClass.wishMeLuck();

        //When calling (using) a method with params
        //we have to pass values to the params
        firstMethodClass.printSumOfTwoNums(10, 20);
        firstMethodClass.printSumOfTwoNums(50, 100);
        firstMethodClass.printSumOfTwoNums((int)12.0, (int) 12.0);
        firstMethodClass.anyText("Hello World!");
        firstMethodClass.concatAndPrintTwoStrings("Good", "Job");
        firstMethodClass.printEmailSignatureForJohnDoe();
    }

    public void printSomething() {
        System.out.println("Printing message from a method");
    }


    public void printHelloWorld() {
        System.out.println("Hello world!");
    }

    //write a method which will print any text I'll provide

    public void anyText(String text) {
        System.out.println(text + "!");
    }

    //write a method which will concatenate (add two Strings together)
    //ex: user gives "Good" and "Job' => Good Job

    public void concatAndPrintTwoStrings (String good, String job) {
        System.out.println(good + " " + job);
    }

    //emails: -> signature
    //ex: John Doe
    // Senior Developer
    // 312-312-3322

    public void printEmailSignatureForJohnDoe() {
        System.out.println(" John Doe\n Senior Developer\n 312-312-3322");
    }
}



