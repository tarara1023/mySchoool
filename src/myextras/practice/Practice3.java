package myextras.practice;

public class Practice3 {

    public static void main(String[] args) {

        //reversemethod reverse a string.In this
        // task reverse the sentence not a
        // string.it gets a entenceand returns it in
        // reverse.EX:sentence: “ DevX is fun” reverse:
        // “fun is DevX”

        ////Write a method which will reverse the String preserving the word order.
        ////John Doe --> nhoJ eoD
        ////Hello World 2020 -> olleH dlroW 0202

        String sentence = "Hello World 2020";
        String reverse = "";
        int quotes = 0;



        for (int i = 0; i < sentence.length(); i++) {
            for (int j = sentence.indexOf(" "); j >=0; j--) {
                reverse += sentence.charAt(j);
            }
        }
        System.out.println(reverse);
    }
}
