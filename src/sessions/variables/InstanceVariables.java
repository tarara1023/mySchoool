package sessions.variables;

public class InstanceVariables {
//instance variables - are created on class level
    //instance variables can have acces modifiers.
    //inctance variables are the characteristics of an object
    //instance variables have default values;
    //numbers and floats have 0 or 0.0
    // boolean - false;
    // char - ' ';
    //String and all other objects have => null
    public static int num = 0;
    private static int num1;
    protected static String str;
    static StringBuilder sb;

    int num2 = 1000;
//we cannot use non static variables with static methods
// without creating an Object from the class
    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(num1);
        System.out.println(str);
        InstanceVariables ob = new InstanceVariables();
        System.out.println(ob.num2);
        //Non static variables and method can be accesed only from reference inside static method
    }

    //the difference between local vs instance variables are:
    //1. instance  variables have default values - local vars dont
    //2. instance variables can have acces modifiers like
    //(public, protected, private, default(empty)
    //3. as well as optional specifiers like (static, final(...) local vars cant

}
