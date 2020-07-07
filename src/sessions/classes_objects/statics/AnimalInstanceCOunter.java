package sessions.classes_objects.statics;

import sessions.classes_objects.Animal;

import java.util.ArrayList;

public class AnimalInstanceCOunter {

    public static void main(String[] args) {
        System.out.println("2");
        System.out.println(Animal.counter);
        Animal demo = new Animal("Dog", "Labrador", 2, 0, 'M', 9, false);
        Animal demo2 = new Animal("Dog", "Labrador", 2, 0, 'M', 9, true);
        System.out.println(Animal.counter);
        System.out.println(demo.coun);




    }
}
