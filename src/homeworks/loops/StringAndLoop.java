package homeworks.loops;

public class StringAndLoop {

    public static void main(String[] args) {
        StringAndLoop stringAndLoop = new StringAndLoop();
        System.out.println(stringAndLoop.stringX("xxHxix"));
        System.out.println(stringAndLoop.stringX("hello"));
        System.out.println(stringAndLoop.stringX("xx"));
        System.out.println(stringAndLoop.stringX("xxxxxxx"));

    }
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i>0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;

    }
}
