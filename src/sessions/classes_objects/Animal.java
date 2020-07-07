package sessions.classes_objects;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

//Part of Animal Shelter application
//We can adopt the animals
//we can give the animals to new families
public class Animal {
    private String breed;
    private String type;
    //if the age is available, store it, otherwise, assign it -1;
    private int age;
    //how long has it been in the shelter
    private int duration;
    private LocalDateTime timeCreated = LocalDateTime.now();

   private char gender;
    private double weight;
    private boolean isInjured;
    private static List<String> animals;
    public static int counter = 0;
    public int coun = 0;
    {
        weight = -10;
        System.out.println("Instance Initializer");
    }
    static {
        animals = Arrays.asList("dog", "cat", "rabbit");
        System.out.println("static initializer");
    }
    //There are two sides to the app
    //1. Our employees(internal app)
    //2. Our clients

    //Employees will add an animal to the stock
    //User will be searching for a specific animal in the stock
    //Employees must enter all of the data for the dog

    //create a method witch will heal the animal
    //make sure isInjured is true
    public void heal() {
//        this.isInjured = true;
        setInjured(true);
    }

    public void run(double miles) {

        if(miles > 2)
          this.weight-=4;
        else if(miles <= 2 && miles > 1)
            this.weight-=5;
        else
            System.out.println(type + " didnt run long enough to lose any weight");

    }

    //write a methos which will return me the duration of the object in the shelter
    public String getDurationByTime() {
        Duration period = Duration.between(timeCreated, LocalDateTime.now());
        String duration = String.valueOf(period.getSeconds());
        return duration;
    }


    @Override
    public String toString() {
        return
                "breed='" + breed + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", duration=" + duration +
                ", gender=" + gender +
                ", weight=" + weight +
                ", isInjured=" + isInjured;
    }
    public Animal(String type, String breed, int age, char gender, boolean isInjured) {
//        this.type = type;
//        this.breed = breed;
//        this.age = age;
//        this.gender = gender;
//        this.weight = -1;
//        this.duration = -1;
//        this.isInjured = isInjured;
        this(type, breed, age, -1, gender,-1, isInjured);
    }

    public Animal(String type, String breed, int age, int duration, char gender, double weight, boolean isInjured) {
        System.out.println("Creating an animal with the full info");
        if(animals.contains(type))
        this.type = type;
        else this.type = "0";

        this.breed = breed;
        this.age = age;
        this.duration = duration;
        this.gender = gender;
        this.weight =weight;
        this.isInjured = isInjured;
        System.out.println("Done creating animal");
        counter++;
        coun++;
    }
    public Animal(String type, String breed, char gender) {
        this(type, breed, -1, -1, gender, -1, false);
    }

    public void setAge(int age) {
        if(age > this.age)
        this.age = age;
        else System.err.println("No such age");
    }
    public int getAge() {
        return age;
    }

    //First getType than setType
    public String getType() {
        return type;
    }

    public void setType(String type) {
//        String [] anim = {"dogs", "cats", "rabbit"};
//        for(String ani: anim) {
//            if(type.equalsIgnoreCase(ani))
//                this.type = type;
//            else System.out.println("No such type");
        switch (type.toLowerCase()) {
            case "dog":
            case "cat":
            case "rabbit":
                this.type = type;
            default:
                System.out.println("Unsuported animal type");
        }

    }

    public String getBreed() {
        return breed;
    }
    public void setBreed() {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }


}
