package myextras;

public class NestedForLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i < 32; i *= 3) {
            System.out.print(i + ":");
            for (i = 6; i < 14; i += 2) {
                System.out.print(i + ":");
            }
        }
        System.out.println();
        drawPlus();
        drawBarLine();
        drawPlus();
        System.out.println();
        drawPlus();
        drawBarLine();
        drawBarLine();
        drawPlus();
    }
        public static void drawPlus() {
            System.out.print("+");
            for (int i = 1; i <= 5; i++) {
                System.out.print("/\\");
            }
            System.out.println("+");
        }
        public static void drawBarLine() {
            System.out.print("|");
            for (int i = 1; i <= 10; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

