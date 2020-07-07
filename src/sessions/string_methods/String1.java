package sessions.string_methods;

public class String1 {

    public static void main(String [] args) {

        String name = "Elon Musk";
        System.out.println(name);


        //Whu Do I have this options?
        //what is the difference between
        //creating String with literal
        //and as an Object?

        String name2 = new String ("John Doe");
        System.out.println(name2);


        //concatenation
        String a = "Name ";
        String b = " is John";
        String c = a + b;
        System.out.println(c);

        int num1 = 5;
        int num2 = 6;
        System.out.println(a + num1); //If one side is String the result is String
        System.out.println(a + num1 + num1); // Name56, a+num1 --> String
        System.out.println(num1 + num2 + a);//11Name, num1+num2 --> int

        String ss = "4";
        ss+=5; //ss = ss + 5; (45)
        System.out.println(ss);




    }
}
