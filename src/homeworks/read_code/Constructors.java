package homeworks.read_code;

public class Constructors {

    Constructors (int a, int b) {
        System.out.println(" a " + a + " b " + b);
    }
    Constructors(int a, float b) {
        System.out.println(" a " + a + " b " + b);
    }

    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
//        Constructors constructors = new Constructors(a, b);
        ClassB mySub = new ClassB(7);
        mySub.Method1(2);
    }
}
