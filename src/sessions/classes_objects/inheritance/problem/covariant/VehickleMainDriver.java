package sessions.classes_objects.inheritance.problem.covariant;

import java.time.LocalDate;

public class VehickleMainDriver {

    public static void main(String[] args) {
        //Create a vehicle object
        Vehicle vehicle = new Vehicle(4,"Black",12343443,true);
        Object vehicle2 = new Vehicle(4,"White",32343443,false);
        //Create RegisteredVehicle Object
        RegisteredVehicle registeredVehicle =
                new RegisteredVehicle(4,"Red",134345454,true,
                        "AN123", LocalDate.of(2020,5,2), LocalDate.of(2021, 5, 2));
        Vehicle registredVihicle2 = new RegisteredVehicle(4,"Blue",23322434,true,
                "ABC222", LocalDate.of(2020,4,22), LocalDate.of(2021, 4, 22));
        //Create Bike Object
        Bike bike =
                new Bike(2,"black",1213223,
                        "AC2323",LocalDate.of(2020,4,22),
                        LocalDate.of(2021, 4, 22),
                        "Sport", "Yamaha",1000);
        RegisteredVehicle bike2 =  new Bike(2,"blue",1213223,
                "Abb2323",LocalDate.of(2020,4,22),
                LocalDate.of(2021, 4, 22),
                "Sport", "BMW",1000);
        Vehicle bike3 =  new Bike(2,"Yellow",33434,
                "jjj222",LocalDate.of(2020,4,22),
                LocalDate.of(2021, 4, 22),
                "Sport", "Honda",1000);
        System.out.println("price for vehicle object " + VehicleShop.estimatePrice(vehicle));
        //vehicle2 is stored in Object class, which is larger than Vehicle class, so it Vehicle param cannot take it.
        //we can use casting in order to narrow down the variable data type
        System.out.println("price for vehicle object " + VehicleShop.estimatePrice((Vehicle)vehicle2));

       Vehicle vech = VehicleShop.createAnObject("vehicle");
       Bike bike1 = (Bike)VehicleShop.createAnObject("bike"); //casting!!!!!

        System.out.println();


    }

}
