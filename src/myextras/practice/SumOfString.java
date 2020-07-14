package myextras.practice;

public class SumOfString {

    public static void main(String[] args) {
        String str = "java";
        System.out.println(sumOfString(str));
    }
    public static int sumOfString(String str) {
        char [] charArr = str.toCharArray();
        int sum = 0;
        for(int i =0; i < charArr.length; i++) {
            sum += charArr[i];
        }
        return sum;
    }
}
