package sessions.classes_objects.inheritance.problem.covariant;

import java.time.LocalDate;

public class RegisteredVehicle extends Vehicle {
    private String registartinNum;
    private LocalDate registationDate;
    private LocalDate expirationDate;

    public RegisteredVehicle(int numOfWheels, String color, long vin, boolean isGas, String registartinNum, LocalDate registationDate, LocalDate expirationDate) {
        super(numOfWheels, color, vin, isGas);
        this.registartinNum = registartinNum;
        this.registationDate = registationDate;
        this.expirationDate = expirationDate;
    }
    public RegisteredVehicle() {

    }

    public String getRegistartinNum() {
        return registartinNum;
    }

    public void setRegistartinNum(String registartinNum) {
        this.registartinNum = registartinNum;
    }

    public LocalDate getRegistationDate() {
        return registationDate;
    }

    public void setRegistationDate(LocalDate registationDate) {
        this.registationDate = registationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Double sum(int a, int b) {
        return (double)a+b;
    }
}
