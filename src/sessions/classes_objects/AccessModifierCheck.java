package sessions.classes_objects;

import java.util.LinkedList;
import java.util.List;

public class AccessModifierCheck {



    public static void main(String[] args) {
        Car car1 = new Car(2020, 0, "Buggati", "Veron", "red", 2000000.00);
       // car1.printX(); => local variable are not accesble from dif classes
//        car1.color = "black";
        //instance veriable are accessible from dif classes
        int year = car1.year;
        System.out.println(year);
        System.out.println(car1.color);
        System.out.println(car1.make);
        System.out.println(car1.price);

        Car car2 = new Car(2013, 250000, "Toyota", "Camry", "Grey", 2000);
        int year2 = car2.year;
        System.out.println(year2);




        //Homework Create 5 cars put them in List.
        //and print out the cars make, model and year only if the milage is not more than 100000
        //you only need one sout

    }
}
