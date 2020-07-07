package myextras.OCA;

import java.util.function.Predicate;

public class Lambda1 {
    int age;

    public static void main(String[] args) {
      Lambda1 p1 = new Lambda1();
      p1.age = 1;
      check(p1, p -> p.age < 5);
    }
    private static void check(Lambda1 l1, Predicate<Lambda1> p) {
        String result = p.test(l1) ? "match" : "not match";
        System.out.println(result);
    }
}
