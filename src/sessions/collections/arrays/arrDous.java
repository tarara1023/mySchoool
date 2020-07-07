package sessions.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class arrDous {

    public static void main(String[] args) {
        System.out.println(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));




    }
    public static ArrayList<Integer> removeDups(ArrayList<Integer> ls) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i: ls) {
            if (!res.contains(i))
                res.add(i);
        }
        return res;
    }

    public static void revomeDups (ArrayList<Integer> ls) {

        for(int i = 0; i < ls.size(); i++) {
            int current = ls.get(i); //value
            if(ls.indexOf(current) != ls.lastIndexOf(current)) //first 3 index 0, == 0, if its only one 3
                ls.remove(i--);
        }

    }
    public static ArrayList<Integer> removeDups3(ArrayList<Integer> ls) {
        return new ArrayList<>(ls.stream().distinct().collect(Collectors.toList()));
    }

}
