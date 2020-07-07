package myextras.dataStructure_Algoritms.practice;

public class MissingNUmber {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 0, 5, 6};
        int counter = 1;
        for (int i = 0;i<arr.length-1;i++) {
            if(arr[i] != counter) System.out.println(arr[i]);
            counter++;
        }


    }
}
