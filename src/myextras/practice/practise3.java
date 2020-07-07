package myextras.practice;

public class practise3 {
    public static void main(String[] args) {

        //When gears merge and work
        // together, one teeth from each one goes in order.
        // Write a method mergeStrings hat will return the strings
        // merged, one letter at a time, starting with one. Please note
        // oneand twocan be of different lengths.Please look at below
        // examples:S1 ➔"12345"S2 ➔"abcde"mergeStrings(s1,s2) ➔"1a2b3c4d5e"mergeStrings
        // ("wooden", "spoon"
        // ➔"wsopoodoenn"mergeStrings("java", "selenium")➔"
        // jsaevlaenium"

        String s1 = "12345";
        String s2 = "abcde";

        String str1 = "";
        String str2 = "";
        String str3 = "";

        for (int i = 0; i < s1.length(); i++){
            for (int j = i; j < s2.length(); j++) {

                System.out.print(s1.charAt(i)+ "" + s2.charAt(j));
                break;

            }



        }

    }
}
