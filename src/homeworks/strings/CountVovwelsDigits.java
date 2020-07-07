package homeworks.strings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CountVovwelsDigits {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        DecimalFormat decim = new DecimalFormat(".00");

        String word = inp.next().toLowerCase();
        int counter = 0;
        int counter2 = 0;


        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
            || letter == 'u')
                counter++;
            if (letter >= '0' && letter <= '9')
                counter2++;


        }
        double percent = (double)counter / word.length() * 100;
        double percent2 = (double)counter2 / word.length() * 100;
        System.out.println(counter + "(" + decim.format(percent) + "%)");
        System.out.println(counter2 + "(" + decim.format(percent2) + "%)");

    }
}
