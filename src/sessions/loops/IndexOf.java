package sessions.loops;

public class IndexOf {

    //indexOf(char c, String s)  implementation
    public static void main(String[] args) {
        System.out.println(indexOf("Devxschoooool", 'o'));
        //substring(1, 2)
    }


    public static int indexOf(String str, char c) {
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == c)
                return i;
            i++;
        }

        return -1;

    }

    public static String substring (String str, int beginning, int end) {
        //devxSchool (4, 8)
        //Scho
        int i = 0;
        while (i < str.length()){
            if (beginning >= str.length() || end >= str.length()) return  "";
            if (beginning < 0 || end < 0) return "";

        }
        return "";


    }

}


