package sessions.methods;

public class StaticMethods {
    public static void main(String[] args) {
        helloMessage("John Doe");
//        double conv = Converter.convertCtoF(34); // static method
//        System.out.println(conv);

        Converter classVar = new Converter();
        double fdegrees = classVar.covertFtoC(93); // non static method


    }

    //hello John
    //
    public static void helloMessage(String name) {
        System.out.println("Hello " + name);
    }
}
