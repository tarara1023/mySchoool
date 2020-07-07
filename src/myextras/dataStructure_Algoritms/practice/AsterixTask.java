package myextras.dataStructure_Algoritms.practice;

import myextras.dataStructure_Algoritms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsterixTask {

    public static void main(String[] args) {
        List <String> arr = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        int size = arr.size();

        for(int i =0; i<size; i++) {
          if(arr.get(i).length()>=4) {
              arr.add(i, "****");
              i++;

          }

        }
        System.out.println(arr);

    }
}
