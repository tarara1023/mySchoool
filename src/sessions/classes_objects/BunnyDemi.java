package sessions.classes_objects;

public class BunnyDemi {

    public static void main(String[] args) {
        //Constructor are the only way to create objects.
        //What is default constructor
        //a constructor that was created by java
        //bc no constructor was created explicitly

        Bunny b1 = new Bunny();


        System.out.println(b1.color + " " + b1.length + " " + b1.height + " " + b1.gender);

        Bunny b2 = new Bunny("red");
        System.out.println(b2.color + " " + b2.length + " " + b2.height + " " + b2.gender);


    }

}


