package sessions.string_methods;

public class StringLength {

    public static void main(String[] args) {

        String str = "John Doe";

        System.out.println(str.length());

        int index = str.length();
        System.out.println(index);

        String str2 = "Elon Musk";
        System.out.println(str2.length());

        System.out.println(str2.charAt(8));
        System.out.println(str2.length()-1);

        int lastChar = str.length() -1;
        System.out.println(str.charAt(lastChar));

        System.out.println(lastChar(str2));
        System.out.println(lastChar("John Hopkins"));


    }

    /**
     * This is method documentation
     * one bib difference between regular comment and documentation
     * documentations are visible where methods are used
     * @param str
     * @return
     */
    public static char lastChar(String str) {
        int lastChar = str.length()-1;
        return str.charAt(lastChar);

    }
}
