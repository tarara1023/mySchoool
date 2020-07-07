package homeworks.strings;

public class StringPool {

    public static void main(String[] args) {
        String str = new String ("ABC");
        String str2 = new String ("ABC");

        System.out.println(str == str2);

        //Immutability
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        s1 = s2.concat("4");
        System.out.println(s1);
        System.out.println(s2);


    }
}
