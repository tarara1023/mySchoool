package sessions.loops;

import java.util.Scanner;

public class NestedLoopTimeTable {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();



            for (int i = 0; i <= size; i++) {
                if (i == 0) {
                    PrintHead();
                    continue;
                }
                for (int j = 0; j <= size; j++) {

                    System.out.print(i * j + " ");
                }
                System.out.println("");
            }

        }
        public static void PrintHead () {
            System.out.print("* | ");
            for (int i = 1; i <=10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public static void PrinHead2 (){
        for (int i = 1; i <=10; i ++) {
            System.out.println(i + "|");
        }

        }
    }

