package sessions.classes_objects;

public class Car {

    //default(when we put nothing)
    //protected
    //private
    //public
    //Every time i create object from this class I should be able to give info that is specific to the
    //one car.

    int year;
    public long mileage;
    protected String make;
    public String model;
    String color;
    double price;
//right click
    //generate
    //toString
    //make sure everything is chosen
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mileage=" + mileage +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //Costructor needs to be named same as class name caseSensitive
    //Constructor doesnt have any return type
    //COnstructor is used to initialize instance variables
    //COnstructor is used to initial state(condition)
    //Construct is used to create an object by using new keyword

    public Car(int year, long mileage, String make, String model,
               String color, double price) {
        //year = year; => update it by itself
        this.year = year; //this keyword refer to instanse variable, without this to parameter
        //what problem does it solve?
        //great ptogrammers have a problem with coming up with names
//        year = carYear;
        this.mileage = mileage;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
//      Never put logic in constructor that is not using for purpose initialising
//        if(mileage < 100000) {
//            System.out.println("Car make: " + make + " Car model: " + model + " Car year: " + year);
//        }

    }

    public void printOutYear() {
        year = 1;
        printX();
    }
    public  void printX() {
        int x = 10;
        System.out.println("x");
    }


}
