package sessions.classes_objects;

public class Bunny {

    public String color;
    public int length;
    public int height;
    public char gender;


    //Whar is the purpose of overloading constructors?
    //Always take deep down. Start from the fundamentals.
    //Since constructors are used to create objects
    //and give the objects initial state by initializing
    //instance variables with values coming from constructor param.
    //Overloading constructors gives us an ability to take only necessary info and
    //skip some of the instance variables uninitialized

    public Bunny() { }

    public Bunny(String color) {
        this.color = color;

    }

    //create a constructor which will create a Bunny object only with color, length, height
    //create a constructor all inf


    //by creating an object with no arg constructor we are
    public Bunny(String color, int length, int height) {
        this.color = color;
        this.length = length;
        this.height = height;
    }

    public Bunny(String color, int length, int height, char gender) {
        this.color = color;
        this.length = length;
        this.height = height;
        this.gender = gender;
    }
}
