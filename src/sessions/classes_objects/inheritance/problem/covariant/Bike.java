package sessions.classes_objects.inheritance.problem.covariant;

import java.time.LocalDate;

public class Bike extends RegisteredVehicle {

    private String type;
    private String brand;
    private double price;


    public Bike(int numOfWheels, String color, long vin, String registartinNum, LocalDate registationDate, LocalDate expirationDate, String type, String brand, double price) {
        super(numOfWheels, color, vin, false, registartinNum, registationDate, expirationDate);
        this.type = type;
        this.brand = brand;
        this.price = price;
    }
    public Bike() {

    }
}
