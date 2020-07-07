package homeworks.strings;

public class StringBuilder2 {

    public static void main(String[] args) {


        StringBuilder abc = new StringBuilder("Learn Share Learn");

        System.out.println(abc.deleteCharAt(abc.indexOf("s")));

        System.out.println(abc);

    }
}
