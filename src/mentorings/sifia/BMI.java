package mentorings.sifia;

import javax.crypto.spec.PSource;

public class BMI {
/*
BMI - body mass index
person name
weight
height
age
2 COnstructor: 1- takes everything (name, age, height, weight)
               2- constr(name, height, weight) --> make it call first constructor

               methods:
               get BMI(): double
               getStatus: String

 */
    private String name;
    private int age;
    private double height;
    private double weight;
    public static int counter;

    public BMI(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        counter++;
    }
    public BMI(String name, double height, double weight) {
        this(name, 20, height, weight); //must be on the first line
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return Math.round(weight/Math.pow(height, 2));
    }
    public String getStatus() {
        double bmi = getBMI();
        if (bmi <= 18.5) return "Under fat";
        else if(bmi > 18.5 && bmi < 25) return "healty";
        else if (bmi >=25 && bmi < 30) return "overfat";
        else return "obese";
    }









}
