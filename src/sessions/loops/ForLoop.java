package sessions.loops;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println(reverseWord("Hello"));
        int sum = 0;
        int i;

        for (i = 10; i > 0; i--) {
            System.out.println("Hello!" + i);
        }
        for (i = 0; i < 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is : " + sum/i);


    }
    public static String reverseWord(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) { //number of iterations
            reversed += str.charAt(i);

        }
        return reversed;

    }

}
