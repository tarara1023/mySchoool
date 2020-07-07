package sessions.collections.arrays;

public class ArraysFirstClass {

    //main is starting point of the program
    //we can provide some option to our program
    // go to run configs -> configuration
    //and put String values separated by a space in
    //program arguments text box.

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        if (args[0].equals("Mass"))
            System.out.println(args[0]);
        else if (args[0].equals("Distance"))
            System.out.println(args[0]);
        else
            System.out.println("invalid entry");
    }
}
