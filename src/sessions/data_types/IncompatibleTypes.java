package sessions.data_types;

public class IncompatibleTypes {

    public static void main(String[] args) {

        double d = 25.2;

        //int num = d; doesnt compile inconpatible type error;

        int num = (int)d;
        System.out.println("explicitily casted double to int: " + num);

        long longNum = (long)d;
        System.out.println("explicitly casted double to long: " + longNum);

        float fNum = 223.2f;
        int intNum2 = (int)fNum;
        System.out.println("explicity casted float to int " + intNum2);





        ///// implicit Casting
        // When converting smaller memory size data types to bigger ones we dont need to give explicit casting
        // We can implicitly cast whole number to decimals.
        int i = 1000;
        double doubleNum = i;


    }
}
