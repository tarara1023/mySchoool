package myextras;

public class IncrementOperators {
    public static void main(String[] atgs) {

        int tuna = 5;
        int bass = 12;
        if (tuna < 9 || bass <10) {
            System.out.println("yes");
        } else {
            System.out.println("THis is else");
        }

        // || - or
        // & - and

        tuna++;
        bass += 2;

        System.out.println(tuna);
        System.out.println(bass);
    }
}

class IncDecOperation
{
    public static void main(String args[])
    {

        int x=1;

        System.out.println(x); //1 - correct

        x++;

        System.out.println(x); //2 - correct

        ++x;

        System.out.println(x); //3 - correct

        int y=3;

        System.out.println(y); //3 - correct

        --y;

        System.out.println(y);  //2 -correct, but we had to change ":" for ";" to run a program

        y--;

        System.out.println(y);  //1 - correct

    }
}

