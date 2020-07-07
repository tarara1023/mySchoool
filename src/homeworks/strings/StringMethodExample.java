package homeworks.strings;


public class StringMethodExample {

    public static void main(String[] args) {
        StringMethodExample myObject = new StringMethodExample();
        String helloName = myObject.helloName("Bob!");
        String helloName1 = myObject.helloName("Alice!");
        String helloName2 = myObject.helloName("X!");
        System.out.println(helloName +"\n"+ helloName1 + "\n" + helloName2);

    }

    public String helloName (String name) {
        String hello = "Hello ";
        return hello.concat(name);


    }
}
