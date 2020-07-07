package sessions.collections.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtil {


    public static void main(String[] args) {

        List<String> shirts = new ArrayList<>(Arrays.asList("XL", "S", "M", "M", "L", "XS", "S", "XL"));
        System.out.println(shirts);

        //to sort collections like List, Set
        //we can use collections.sort(list)

        Collections.sort(shirts);
        System.out.println(shirts);

        List<Integer> nums = new ArrayList<>(Arrays.asList(234, 55, 7, 322, 55, 21, 46, 76));
        Collections.sort(nums);

        int maxV = Collections.max(nums);
        //max method doesnt expect the collections to be sorted
        System.out.println(maxV);

        int minValue = Collections.min(nums);
        System.out.println(minValue);

        Collections.reverse(nums);
        System.out.println(nums);


        Collections.sort(nums);
        int indexOfOne = Collections.binarySearch(nums, 22);
        System.out.println(indexOfOne);

        Collections.swap(nums, 0, nums.size() - 1);
        System.out.println(nums);

        List<Integer> num2UnMod = Collections.unmodifiableList(nums);
        System.out.println(num2UnMod);
        // num2UnMod.add(2);

        /**
         * This is print method
         */
    }
        public void print(){};

    /**
     * Sums up the value of i with value of x
     *
     *
     */
    public void sum (int i, int x) {
        //java.doc - uses for methods
        ////When creating methods myself or peer reviewing codes I always make sure methods have clear
        // and specific Java Docs
    }






}

