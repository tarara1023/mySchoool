package homeworks;

    public class ArithmeticOperatorDemo {
        public static void main(String args[]) {
            // Please fill out the missing part of the code and run the code
            int num1=20;
            int num2 =10;


            System.out.println("num1 + num2: " + (num1 + num2) );
            System.out.println("num1 - num2: " + (num1 - num2) );
            System.out.println("num1 * num2: " + (num1 * num2) );
            System.out.println("num1 / num 2: " + (num1 / num2) );
            System.out.println("num1 % num2: " + (num1 % num2) );
        }
    }

    class Assignment2A {
        public static void main(String[] args) {

            int number1 = 25;
            int number2 = 5;

            System.out.println("Sum of two integers: " + (number1 + number2));
            System.out.println("Difference of two integers: " + (number1 - number2));
            System.out.println("Product of two integers: " + (number1 * number2));

        }

    }

    class Assignment2B {
        public static void main(String[] args) {

            int a=-5;
            int b=8;
            int c=6;
            int result=a+b*c;
            System.out.println(result);

            int d=55;
            int f=9;
            int result_b = (d+f)%f;
            System.out.println(result_b);

            int g=20;
            int k=-3;
            int l=5;
            int result_c = (g+k*l/b);
            System.out.println(result_c);

            int p=15;
            int r=3;
            int x=2;
            int result_d = (l+p/r*x-b%r);
            System.out.println(result_d);


        }
    }
