package sessions.loops;

public class LoopsPractice {

    public static void main(String[] args) throws InterruptedException {

        String str = "*";
        int number = 5;

        while (number > 0) {
            System.out.println(str);
            Thread.sleep(1000);
            str += "*";
            number--;

        }
    }

//
//        int num = 0; // even numbers
//
//        while (num <= 100) {
//            if (num % 2 == 0)
//            System.out.println(num);
//            num++;
//        }
//
//        while (num > 0) {
//            System.out.println(num);
//            num +=2;
//        }
//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            Thread.sleep(1500); // Pauses the execution for  given num of millisec
//            i--;
//        }
//        int cookiesToBake = 5;
//
//        while (cookiesToBake > 0) {
//            System.out.println("Bake cookie");
//            cookiesToBake--;
//        }
//
//        int numberOfQMarks = 4;
//        while (numberOfQMarks-- > 0) {
//            System.out.print("?");
//            //numberOfQMarks--;
//

        }



