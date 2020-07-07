package homeworks.strings;

public class Substrings {

    public static void main(String[] args) {
        String s = "WelcomeToDevXSchool";
        System.out.println(s.substring(s.indexOf("D"), s.indexOf("X")+1)); // or s.substring(9, 13)
        System.out.println(s.substring(s.indexOf("S"))); // s.substring(13);
    }
}
