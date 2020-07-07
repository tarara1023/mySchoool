package sessions.variables;

public class LocalVariables {
//instance
    int num1 = 0;
    int num2;

    public static void main(String[] args) {

        int i;
        int x = 0;
        System.out.println(x); //must be initialized before using it
        //local variables dont have default values;
        int y = 1;

        if (x < y) {
            i = 20;
            System.out.println(i);
        }else {
            i=0;
        }
        System.out.println(i);


    }
}
