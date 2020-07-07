package homeworks.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicate {
    public static void main(String[] args) {

        //Weakness
        // fixed size
        //doesnt provide you many ready made methods to use
        //Difficult to go throu each items

        //Strength
        // its is able to handle premative and objects
        //it is fastest to lookup

        //find me first duplicate in array
        int[] arr = {1, 5, 4, 4, 9, 7, 7, 1, 8, 5, 8};
        System.out.println(findFirstDuplicateArray(arr));
        System.out.println(findAllDuplicateArray(arr));

    }

    public static int findFirstDuplicateArray(int[] numbers) {
        //sort the array
        //for loop for going thro each number in array
        // if statement for next index for the item in array
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i + 1])
                return numbers[i];

        }


        int temp = -1;
        for (int arr : numbers) {
            if (arr == temp)
                return arr;
            temp = arr;
        }
        return -1;

    }

    public static ArrayList findAllDuplicateArray(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList duplicates = new ArrayList();

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                duplicates.add(numbers[i]);


            }

        }
        return duplicates;

    }


}
