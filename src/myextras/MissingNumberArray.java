package myextras;

public class MissingNumberArray {

    public static void main(String[] args) {



    }
    public static int returnMissing (int [] arr) {

        int i = 1;
        for (int num: arr) {
            if (num != i)
                return i;
            i++;
        }
        return -1;


    }
}
