package sessions.collections.arrays;

import java.util.Arrays;

public class ArraysToString {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 6, 9};


        System.out.println(Arrays.binarySearch(arr, 6));


        System.out.println(Arrays.toString(arr)); //print all Array

        int [] addToArray = arrAdd(arr, 5);
        System.out.println(Arrays.toString(addToArray));


    }
    public static int[] arrAdd (int [] arr, int varNew) {
        int size = arr.length + 1;
        int [] arrNew = new int [size];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr [i];
        }
        arrNew[size -1] = varNew;
        return arrNew;

    }
    public static int [] revArr (int [] ar) {
        int [] arr  = new int [ar.length];

        for (int i = ar.length -1, ind = 0; i >= 0; i--, ind++) {
            arr [ind] = ar[i];
        }
        return arr;

    }
    public static void rev2 (int [] ar) {
        for (int i = 0; i < ar.length/2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length -1 - i] = temp;
        }



    }
}
