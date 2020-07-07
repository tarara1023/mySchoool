package homeworks.loops;

public class FirstHalfOfWord {

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));



    }
    public static String firstHalf (String word) {
        String half = "";
        for (int i = 0; i < word.length()/2; i++) {
            half += word.charAt(i);
        }
       return half;
    }
}
