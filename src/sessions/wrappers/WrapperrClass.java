package sessions.wrappers;

public class WrapperrClass {

    public static void main(String[] args) {
        //This will be seen once in a while
        String currentYear  = "2020";
        String dob = "1982";

        //Wrapper classes provide methods that can  convert String format to int, double etc.
        //converting from String to promotive data types is called parsing.
        //parseInt(String s);
        //parseInt(String s, int radix);

        int year = Integer.parseInt(currentYear);
        System.out.println(year + "as an int");

        int dobInt = Integer.parseInt("1982");

        int age = year - dobInt;
        System.out.println(age);

        //wrapper class.toString(int i)
        int id = 65;
        String idStr = Integer.toString(id);

        int ssn = 123345678;
        StringBuilder ssnstr = new StringBuilder(Integer.toString(ssn));
        ssnstr.insert(3, "-");
        ssnstr.insert(6, "-");

        int ssnReversed = Integer.reverse(ssn);
        System.out.println(ssnReversed);

        int one = 1223;
        int two = 8999;
        int sum = Integer.sum(one, two);
        System.out.println(sum);

        //Wrapper classes are the pbject representations of primitive data types ehich allow us to
        //store primitive data type in collections like list, Set etc.
        //Wrapper classes also provide useful methods like converting (parsing) values from storing it
        //in a corresponding data type.
        //Also w2e can convert primitive datatypes to String using tiString in each wrapper class.
        //Wrapper classes can be initializezed by primitive data types values, this process callinf autoboxing.












    }
}
