package myextras;

public class ArrayBinarySearchHardCoded {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 8, 9, 10, 12, 14, 15};
        int val = 8;
        System.out.println(binarySearch(arr, val));

    }
    public static int binarySearch(int[] arr, int val) {


//implement double search
        //implement binary serch with string [];

        int start = 0;
        int end = arr.length - 1;
        int midle = end/2;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length - 1; j > 0; j--) {
//
//            }
//        }
//

        for (;start <= end; midle = (end + start)/2) {
            if (arr[midle] == val)
                return midle;
            else{
                if(arr[midle] > val)
                    end = midle-1;
                else
                    start = midle+1;
            }
        }
        return -1;
    }
}
