package sessions.methods;

public class IndexOg {

    //use this method to fins the index pf specific letter
    //or word inside string

    public static void main(String[] args) {

        String str = "John Doe"; // Elon Musk, Steve Jobs, Bill Gates.
        //males easy so we dont have to count
        //plus it works for any name
        System.out.println(str.indexOf(" ")); //4
        int indexOfSpace = str.indexOf(" ");
        System.out.println(str.substring(indexOfSpace + 1)); // str.substring(5)


    }
}
