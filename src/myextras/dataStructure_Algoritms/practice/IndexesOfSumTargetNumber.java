package myextras.dataStructure_Algoritms.practice;

import myextras.dataStructure_Algoritms.Array;

import java.awt.*;
import java.util.*;
import java.util.List;

public class IndexesOfSumTargetNumber {

    public static void main(String[] args) {
        //Given an array of integers, return indexes of the two numbers such that they add up to a specific target.
        //You may assume that each input would have exactly one solution, and you may not use the same element
        //twice.
        //Example: Given nums: = [2, 7, 11, 15];
        //target = 9;
        //because nums[0] + nums[1] = 2+7 = 9;
        //return [0,1]

        int [] nums = {2,7,11,15};
        int target = 9;
        int [] newNu = new int[2];

        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i< nums.length; i++) {
            int diff = target - nums[i];
            hash.put(nums[i], i);
            if(hash.containsKey(diff)) {
                newNu[0] = hash.get(diff);
                newNu[1] = hash.get(nums[i]);

            }
        }
        System.out.println(Arrays.toString(newNu));


    }
}
