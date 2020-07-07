package sessions.methods;

import sessions.string_methods.StringLength;

public class Method3 {

    public static void main(String[] args) {
        Method3 myObject = new Method3();

        System.out.println("About to run my method");
        myObject.printMessage();
        System.out.println("Finished executing my method now I back\n  in the main method");

    }

    public void printMessage() {
        System.out.println("My Method is Called");
    }
}
