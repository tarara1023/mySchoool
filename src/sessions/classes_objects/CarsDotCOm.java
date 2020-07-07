package sessions.classes_objects;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class CarsDotCOm {

    public static void main(String[] args) {
        //Homework Create 5 cars put them in List.
        //and print out the cars make, model and year only if the milage is not more than 100000
        //you only need one sout


        Car car1 = new Car(2020, 0, "Buggati", "Veron", "red", 2000000.00);

        Car car2 = new Car(2013, 250000, "Toyota", "Camry", "Grey", 2000);

        Car car3 = new Car(2012, 110000, "Infiniti", "G25x", "silver", 12000);

        Car car4 = new Car(2020, 20000, "BMW", "3", "blue", 50000);

        Car car5 = new Car(2018, 60000, "Range Rover", "Sport", "black", 45000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);


        for (Car car: cars) {
            if(car.mileage < 100000) {
                System.out.print(car.year + " ");
                System.out.print(car.make + " ");
                System.out.print(car.model + " ");
                System.out.println(car.mileage + " ");
            }

        }

        for(Car car: cars) {
            if(car.year > 2010) {
                System.out.print(car.make + " ");
                System.out.print(car.model + " ");
                System.out.println(car.year + " ");
            }
        }




    }
}
