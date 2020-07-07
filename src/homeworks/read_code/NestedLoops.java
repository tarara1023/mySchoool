package homeworks.read_code;

public class NestedLoops {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Chromhe";
        System.out.println(method(str1));
        System.out.println(method(str2));
        System.out.println(method(str3));

    }

    public static boolean method (String input) {
        for (int i = 0; i < input.length(); i ++) {
            char characterOfUnputString = input.charAt(i);
            int count = 0;
            for (int j = i; j < input.length(); j++) {
                if (characterOfUnputString == input.charAt(j))
                    count++;
            }
            if (count > 1)
                return  false;
        }
        return true;

    }
}
