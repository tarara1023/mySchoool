package sessions.operators.increments;

public class IncrementAndDecrementClasses {

    public static void main(String[] args) {

        int countOfPeopleInTheBuilding = 0;
        countOfPeopleInTheBuilding++;
        countOfPeopleInTheBuilding--;

        int x = 10;
        //int y = ++x; increment and give the incremented value in the same statement;
        int y = x++; // give old value.

        System.out.println(x);
        System.out.println(y);

        int num1 = 55;
        System.out.println(num1++); //55 bc its after variable;
        num1++;
        int number2 = num1;

        int k = 99;
        k++;
        int z = k;
        System.out.println(z);






    }

}
