package sessions.classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAnimalRequest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal dog1 = new Animal("Snake", "Labrador", 2, 0,'M', 12,false);
        Animal dog2 = new Animal("Dog", "Labrador", 3, 0,'F', 8,true);
        Animal dog3 = new Animal("Dog", "Labrador", 1, 'M',false);
        Animal dog4 = new Animal("Dog", "Pitbull", 1, 0,'F', 11,false);
        Animal dog5 = new Animal("Dog", "Pitbull", 2, 0,'F', 13,true);
        Animal dog6 = new Animal("Dog", "Pitbull", 4, 0,'M', 9,false);
        Animal cat1 = new Animal("Cat", "Garfield", 1, 0,'F', 7,true);
        Animal cat2 = new Animal("Cat", "Garfield", 1, 0,'M', 12,false);
        Animal cat3 = new Animal("Cat", "Garfield", 2,'M', false);
        Animal cat4 = new Animal("Cat", "Bengal", 1, 0,'M', 12,true);
        Animal cat5 = new Animal("Cat", "Bengal", 4, 0,'M', 12,false);

        List<Animal> stock = new ArrayList<>();
        stock.add(dog1);
        stock.add(dog2);
        stock.add(dog3);
        stock.add(dog4);
        stock.add(dog5);
        stock.add(dog6);
        stock.add(cat1);
        stock.add(cat2);
        stock.add(cat3);
        stock.add(cat4);
        stock.add(cat5);

        System.out.println("//////////////////");
        System.out.println("User App");
        System.out.println("//////////////////");

        System.out.println("Enter animal type");
        String type = sc.next();

        System.out.println("ENter " + type + "breed");
        String breed = sc.next();
        System.out.println("Enter gender");

        char gender = sc.next().charAt(0);

        //gender is going to be read only if we will delete setMethod
        //and leave only getMethod

        for (Animal animal : stock) {
            if (animal.getType().equalsIgnoreCase(type) && animal.getBreed().equalsIgnoreCase(breed) && animal.getGender() == gender)
                System.out.println(animal);
        }
    }

}
