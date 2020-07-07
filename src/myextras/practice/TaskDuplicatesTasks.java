package myextras.practice;

import java.util.ArrayList;
import java.util.List;

public class TaskDuplicatesTasks {

    public static void main(String[] args) {

        String [] getDup = {"1", "2", "1", "aa", "aa", "aa"};
        System.out.println(getDup2(getDup));
    }

    public static int getDup2(String [] dup) {
        List<String> newarr = new ArrayList<>();
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < dup.length; i++) {
            for (int j = i+1; j<dup.length; j++) {
                if(dup[i] == dup[j]) {
                    newarr.add(dup[j]);

                }

            }
        }
        return newarr.size();
    }
}
