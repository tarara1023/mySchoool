package homeworks;

public class MathExpressions {
    public static void main(String[] args) {

        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        double num1 = 25.5 * 3.5 - 3.5 * 3.5;
        double num2 = 40.5 - 4.5;
        double num3 = num1 / num2;
        System.out.println(num3);


        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

        double a = 1.0/3;
        double b = 1.0/5;
        double c = 1.0/7;
        double d = 1.0/9;
        double t = 1.0/11;
        double o = 1 - a + b - c + d - t;
        double p = 4.0 * o;
        System.out.println(p);
    }

}

