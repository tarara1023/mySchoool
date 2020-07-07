package homeworks.loops;

public class reverse {

    public static void main(String[] args) {
        String reverseee = reverseWord("Yuliana");
        System.out.println(reverseee);
        System.out.println(reverseWord("WORld"));

    }

    public static String reverseWord (String str) {

        if (str == null || str.isEmpty()) {
            return "Invalis Input";
        }
        String reversed = "";
        int i = str.length()-1;

        while (i >= 0) {
            reversed += str.charAt(i);
            i--;

        }
        return reversed;
    }
}
