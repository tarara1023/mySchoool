package sessions.string_methods;

import java.util.Arrays;

public class StringMethodsThatReturnsArrays {

    //There are some methods in String
    //that return arrays
    //String.toCharArray();
    //String.split(String str)

    public static void main(String[] args) {

        //toCharArray of a String return all characters
        //of a String in an array
        //ex: String str = "Hello";
        // char [] strChars = str.toCharArray();
        //char [] strChars = {'H', 'e', 'l', 'l', 'o'};

        String str = "Hello";
        char [] strArr = str.toCharArray();
        char [] str22 = {'H', 'e', 'l', 'l', 'o'};

        System.out.println(strArr);
        System.out.println(str22);

        for (char str1: str22) {
            System.out.print(str1);
        }
        System.out.println();
        for (int i = 0; i < str22.length; i++) {
            System.out.print(str22[i]);
        }
        System.out.println();
        //Collections: List(ArrayList, LinkedList, Set(HashSet, LinkedHashSet, TreeSet)
        //Map(HashMap, LinkedHashMap, TreeMap)

        System.out.println(Arrays.toString(str22));

        //Convert Third Character in Hello

        String hello = "World";
        String sss = "DevX School";
        hello.substring(0, 2).concat("L").concat(hello.substring(3));

        //better implementation(give the logic)
        //what is the implementation of the method means what is the body

        char [] helloAr = hello.toCharArray();
            helloAr[3] = 'L';
        System.out.println(helloAr);

        char [] devXArr = sss.toCharArray();
        int count = 0;
        for (int i = 0; i < devXArr.length; i++) {//for loop
            if (devXArr[i] == 'o')
                count++;
        }
        for (char c: devXArr)//for each loop

            if (c == 'o')
                count++;
        System.out.println(count);




    }
}
