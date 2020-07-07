package sessions.string_methods;

public class Replace {

    public static void main(String[] args) {
        //Replace

        String str = "Doe";
        str = str.replace('D', 'J');
        System.out.println(str);

        String str1 = "Hello";
        str1 = str1.replace('l', 'y');
        System.out.println(str1);

        str1 = str1.replace("Hey", "HeY");
        System.out.println(str1);

        String str2 = "what a beaytiful world";
        str2 = str2.replace("beaytiful", "amazing");
        System.out.println(str2);

        String str4 = "Hello";
        //ReplaceFirst --> returns String whith the first occurance of the given char modified
        str4.replaceFirst("l", "L");
        System.out.println(str4);

        //str.isEmpty() --> return true if the String is empty - "";
        //as pre conditions
        String countNumberOfZ = "Zero Zebras Zorro";
        int index = 0;
        int count = 0;
        while (index < countNumberOfZ.length()) {
            if (countNumberOfZ.charAt(index) == 'Z')
                count++;

            index++;


        }
        System.out.println(count);


    }
}
