package sessions.string_methods;

import java.util.Arrays;

public class SplitMethod {

    //Split method can split a String based on the
    //character (regex) given returns String[]

    //String word = "hello world";
    public static void main(String[] args) {


        String word = "Hello Word";
        String[] words = word.split(" "); // {"Hello", "World"}

        String[] words1 = word.split("H");
        System.out.println(Arrays.toString(words1));

        //count number of words
        String str1 = "hello beatiful. World, i am an sdet";
        String [] wor = str1.split(" ");
        System.out.println(wor.length);
        String [] sentences = str1.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println(Arrays.toString(wor));


    }
}
