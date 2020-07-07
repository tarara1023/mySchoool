package sessions.collections.arrays;

import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalArrays {

    public static void main(String[] args) {


        int [] arr = {32, 17};
        int [] [] arr2 = new int [4][2];

        arr2 [0] = arr;
        System.out.println(Arrays.deepToString(arr2));

        int [] [] bigTable = new int [6] [5];

        bigTable [0] [0] = 10;


        Random rd = new Random();

        for (int row = 0; row < bigTable.length; row++) {
            for (int colunm = 0; colunm < bigTable[row].length; colunm++) {
                if (row == colunm)
                    bigTable [row] [colunm] = 10;
                else
                    bigTable [row] [colunm] = rd.nextInt(10);
                System.out.print("|" + bigTable[row][colunm] + "|");



            }
            System.out.println();
            System.out.println("---------------");
        }



    }
}
