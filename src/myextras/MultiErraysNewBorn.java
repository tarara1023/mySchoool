package myextras;

import java.util.Scanner;

public class MultiErraysNewBorn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int [] [] firstArray = {{inp.nextInt(), inp.nextInt(), inp.nextInt(), inp.nextInt()},
                {inp.nextInt(), inp.nextInt(), inp.nextInt(), inp.nextInt()}} ;
        int [] [] arr = new int [3] [4];
        String [] [] secondArray = {{"yulia", "tania", "marina"}, {"sasha", "anfrey", "viktor"}};
        display(firstArray);



    }
    public static void display (int arr [] []) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr [row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
