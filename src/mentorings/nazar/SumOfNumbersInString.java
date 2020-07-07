package mentorings.nazar;

import java.util.regex.Pattern;

public class SumOfNumbersInString {

    public static void main(String[] args) {
        String adress = "4 1 6 8 N Riv er Rd";
        String neqad = replace(adress);
        int newin = Integer.parseInt(neqad);
        int n =0, sum = 0;
        while(newin>0) {
            n = newin % 10;
            sum += n;
            newin = newin/10;
        }
        System.out.println(sum);

        System.out.println(neqad);
        System.out.println(newin);

    }
    public static String replace(String s) {
        return s.replaceAll("[a-z, A-Z]", "");

    }
    public static void findMatches(String regEx, String str) {
        Pattern check = Pattern.compile(regEx);

    }
}
