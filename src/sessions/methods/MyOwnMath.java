package sessions.methods;

public class MyOwnMath {

    public static void main(String[] args) {
        MyOwnMath math = new MyOwnMath();
        math.pow(5,2);
    }

    public void pow(int num, int pow) {
        System.out.println((int)Math.pow(num, pow));
    }
}

