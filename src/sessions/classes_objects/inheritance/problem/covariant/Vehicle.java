package sessions.classes_objects.inheritance.problem.covariant;

public class Vehicle {

    private int numOfWheels;
    private String color;
    private long vin;
    private boolean isGas;

    public Vehicle(int numOfWheels, String color, long vin, boolean isGas) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.vin = vin;
        this.isGas = isGas;
    }
    public Vehicle() {

    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    public Number sum(int a, int b) {
        return a + b;
    }


}
