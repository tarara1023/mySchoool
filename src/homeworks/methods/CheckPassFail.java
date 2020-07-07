package homeworks.methods;

public class CheckPassFail { // Save as "CheckPassFail.java"
        public static void main(String[] args) {  // Program entry point
            int mark = 80;   // Set the value of "mark" here!
            System.out.println("The mark is " + mark);
            CheckPassFail myObject = new CheckPassFail();
            myObject.passedOrFailed(mark);
            // call your void method here  passedOrFailed();
        }
        //write a method for this example
// use a static void method and write here name and body of the method.
        // if-else statement

    public  void passedOrFailed (int mark) {
      if (mark >=60) {
            System.out.println("Congratulations! You passed!");
        } else {
            System.out.println("You failed!");
        }
      System.out.println("DONE");
    }
}

