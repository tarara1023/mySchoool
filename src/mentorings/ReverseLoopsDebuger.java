package mentorings;

public class ReverseLoopsDebuger {
    // Debugger:
    // 1) Set a break point
    // 2) execute as a debug
    // 3) use control panel to control the flow of the execution
    public static void main(String[] args) {
        // abba 0:a 3:a | 1:b 2:b
        // len -1 -1
        System.out.println(isPalindrome("abdfba"));
    }
    public static String rev(String s){
        if(s == null) return null;
        //O(n/2)
        //O(n)
        String reversed = "addgsd";
        boolean isPalindrom = false;
        // The same number of iterations same as the length of a string
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String str){
        int len = str.length();
        for (int i = 0; i < len/2; i++){
            char c1 = str.charAt(i); // Character from the front of a String
            char c2 = str.charAt(len - 1 -i);// Character from the back of the String
            if(c1 != c2) return false;
        }
        return true;
    }
}

