package myextras.practice;

public class Caller {
    public static void main(String[] args) {

    NestedClasses.NestedStatic.Nested();

    NestedClasses.NestedStatic obj1 = new NestedClasses.NestedStatic();
        System.out.println(obj1.nestedNonStatic());


    NestedClasses obj = new NestedClasses();
    NestedClasses.NonStatic nonStatic = obj.new NonStatic();
        System.out.println(nonStatic.nested());

    }
}
