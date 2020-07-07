package myextras.dataStructure_Algoritms.practice;

import com.sun.tools.classfile.Opcode;
import myextras.dataStructure_Algoritms.Array;
import myextras.dataStructure_Algoritms.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 0, -1, 6};
        int targetSum = 10;

        System.out.println(Arrays.toString(find(array, targetSum)));
        System.out.println("Marat method: " + Arrays.toString(find2(array, targetSum)));

    }

    public static int[] find(int [] array, int targetSum) {

        int[] arrayNew = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    arrayNew[0] = i;
                    arrayNew[1] = j;
                    return arrayNew;
                }
            }
        }
        return new int[0];
    }

    public static int [] find2(int [] array, int targetSum) {
//        int[] array = {3, 5, -4,  8, 11, 1, -1, 6};
        Set<Integer> set = new HashSet<>();
        for (int number: array) {
            int diff = targetSum - number;
            if(set.add(number)) //gives true/false
                set.add(diff);
            else return new int[] {number, diff};
        }
      return new int[0];

    }
}

