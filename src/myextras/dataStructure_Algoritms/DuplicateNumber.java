package myextras.dataStructure_Algoritms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {


        int[] arr = {35, 4, 9, 1, 3, 4, 35};
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length;i++) {
            if(map.containsValue(arr[i]))
                list.add(arr[i]);
                map.put(i, arr[i]);
        }
        System.out.println(list);
    }
}
