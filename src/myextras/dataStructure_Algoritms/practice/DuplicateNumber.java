package myextras.dataStructure_Algoritms.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

    public static void main(String[] args) {
        int arr[] ={1,2,3,1,4,5};

        Set<Integer> sett = new HashSet<>();

        for(int i =0; i < arr.length; i++) {
            if(!sett.contains(arr[i]))
                sett.add(arr[i]);
        }
        System.out.println(sett);


    }

}
