package sessions.loops;

public class alphabets {

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        String str = "ABC";
        StringBuilder str2 = new StringBuilder(str);

        for (int i = 3; i < alphabet.length(); i++) {
//            str = str + alphabet.charAt(i);
            str = str.concat(alphabet.charAt(i) + "");


            str2.append(alphabet.charAt(i));


        }
        System.out.println(str);
        System.out.print(str2);


    }
}
