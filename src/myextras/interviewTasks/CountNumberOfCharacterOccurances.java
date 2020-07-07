package myextras.interviewTasks;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacterOccurances {

    public static void main(String[] args) {
        //Create a program which will calculate the number of each character in a String
        /*ex: apple -> a: 1
                       p: 2
                       l: 1
         */

        //Map<String, Integer> = new HashMap<>();
        //if map doesnt contain the car then add the char as a key
        //and 1 as the value since its the first occurrence of the char.

        String str = "pinaapple";
        int counter = 0;
        for(int i =0; i < str.length();i++) {
            if(str.charAt(i) == 'p') {
                counter++;
            }
        }
        System.out.println("p: " + counter);
        //////

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length();i++) {
            if(!charMap.containsKey(str.charAt(i)))
                charMap.put(str.charAt(i), 1);
            else
//                charMap.replace(str.charAt(i), charMap.get(str.charAt(i))+1);
            charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);
        }

        System.out.println(charMap);

    }
}
