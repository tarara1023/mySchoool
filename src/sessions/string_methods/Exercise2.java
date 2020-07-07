package sessions.string_methods;

public class Exercise2 {

    //replace a seconf appearance of so in a string
    // I am so so programmer shoud turn to Iam so great programmer
    public static void main (String [] args) {
       String replace = replaceSo("I am so so programmer");
        System.out.println(replace);

    }

    public static String replaceSo (String str) {
        int index = str.lastIndexOf("so"); //10
        String p1 = str.substring(0, index); // I am so
        String p2 = str.substring(index + 2); //programmer

        return p1 + "great" + p2;
    }
}

