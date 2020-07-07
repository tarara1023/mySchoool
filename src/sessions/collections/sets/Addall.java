package sessions.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Addall {
    public static void main(String[] args) {
        Set <Integer> s1 = new HashSet<>(Arrays.asList(1,3,4,6,7));
        Set <Integer> s2 = new HashSet<>(Arrays.asList(2,5,8,9,1,4));
        System.out.println(s1);
        s1.addAll(s2);
        System.out.println(s1);
    }
}
