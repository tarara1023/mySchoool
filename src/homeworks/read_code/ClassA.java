package homeworks.read_code;

public class ClassA {
    int b = 1;
}
class ClassB extends ClassA {
    int b = 3;
    int c = 5;

    ClassB(int c) {
        System.out.print(c);
        System.out.println("\t");

    }
    void Method1(int b) {
        System.out.println("b" + this.b);
    }
}
