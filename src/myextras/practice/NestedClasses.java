package myextras.practice;

public class NestedClasses {

    int num = 6;
    static int num2 = 8;


    static class NestedStatic{
        public static void  Nested() {
            System.out.println("Static" + num2);
        }
        public int nestedNonStatic() {return num2;}
    }

    class NonStatic {
        public int   nested() {
            return num + num2;
        }

    }


}
