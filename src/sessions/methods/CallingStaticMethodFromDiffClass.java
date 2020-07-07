package sessions.methods;

public class CallingStaticMethodFromDiffClass {

    public static void main(String[] args) {

        //You have to know the name of method you calling
        //use a method which solves the task
        //if are using someone else's code, how do I know
        //which method does what?

        String name = StaticMethods1.greetings("John!");
        System.out.println(name);

    }
}
