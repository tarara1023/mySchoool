package sessions.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTolist {
    public static void main(String[] args) {

        Integer [] years = {1991, 1992, 1993, 1994, 1995};

        System.out.println(Arrays.toString(years));

        //As list method can only take Object Arrays. meaning no primitiveves
        List<Integer> yearList = Arrays.asList(years);
        //asList method creates a fixed size list.
        System.out.println(yearList);
        //yearList.add(1996);//In throws UnsupportedOperation exeption. bc list was created using asList method from Arrays claqss
        System.out.println(yearList);

        yearList.set(2, 1999);
        System.out.println(yearList);
        System.out.println(Arrays.toString(years));
        //We have to be careful of converting array to list using asList, bc modification to either one of it
        //will affect the other

        List<Integer> finalList = new ArrayList<>(yearList);
        System.out.println(finalList);
        finalList.add(1996);
        System.out.println(finalList);
        System.out.println(yearList);
        System.out.println(Arrays.toString(years));

        char [] grades = {'A', 'B', 'C', 'D', 'F'};
        List<Character> gradeList = new ArrayList<>();
        for (char grade: grades) {
            gradeList.add(grade);
        }
        System.out.println(gradeList);





    }
}
