package sessions.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToArray {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Eagle");

        System.out.println(birds);

        Object [] birdsArrObj = birds.toArray();
        String [] birds2 = birds.toArray(new String[0]);
        System.out.println(Arrays.toString(birds2));

        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(543);

        Integer [] numsArr = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numsArr));





    }
}
