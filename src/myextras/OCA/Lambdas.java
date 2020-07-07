package myextras.OCA;

import myextras.program.MenuOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambdas {

    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        bunnies.add("hitty");
        bunnies.add("habby");
        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h'); //takes Predicates(interface)
        System.out.println(bunnies);
        System.out.println("===================");
        List<Student> ls = new ArrayList<>();
//        List<Student> ls2 = filter(ls, x -> x.age < 18);
//        List<Student> ls3 = filter(ls, x -> x.age >= 18 && x.age <=21);
//        List<Student> ls4 = filter(ls, x -> !x.name.startsWith("A"));



     }
     public static List<Student> filter(List<Student> ls, Predicate<Student> pred) {
        List<Student> copy = new ArrayList<>(ls);
        copy.removeIf(pred);
        return copy;
     }

}
