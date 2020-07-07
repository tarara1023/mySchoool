package sessions.collections.arrays;

public class ArraysLength {
//store the salaries of 10 employees
    public static void main(String[] args) {
        int[] salaries = {100000, 95000, 120000, 99000,
                100000, 97000, 105000, 115000};

        int total = 0;

     for (int i = 0; i < salaries.length; i++) {
         total += salaries[i];


     }
        int avarege = total/salaries.length;;
        System.out.println(avarege);

        //arr.length --> gives us the size of the array
        //in int value;
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String day = "Sunday";
        boolean isWeekday = true;

        for (int i = 0; i < weekdays.length; i++) {

            if (day.equals(weekdays[i])) {
                isWeekday = true;
            }
        }
        System.out.println(isWeekday);

        //








    }
}
