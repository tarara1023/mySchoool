package sessions.classes_objects.inheritance.problem.covariant;

public class VehicleShop {

    //calculate price for vehicle based on it's number of wheels
    //and gas or diesel
    public static double estimatePrice(Vehicle vehicle){
        if (vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
            return 5000.00;
        }
        else if (!vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
            return 2000.00;
        }
        else {
            System.out.println("More features to come");
            return 0;
        }
    }


    //polymorphism
    //flexibility and reusivility
    //Create a method and in Params put a parent class
    //no need to create the same logic for each sublass bc all off them extend from one class

    public static Vehicle createAnObject(String type) {
        switch(type.toLowerCase()) {
            case "vehicle":
                return new Vehicle();
            case "bike":
                return new Bike();
            case "registeredvehicle":
                return new RegisteredVehicle();
            default:
                return null;
        }
    }
}
