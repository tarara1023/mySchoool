package mentorings.nazar;

import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;

public class FakerLambda {

    public static void main(String[] args) {


        Faker f = new Faker();


        List<String> ls = new ArrayList<>();
        for(int i =0; i<10; i++) {
            ls.add(f.name().firstName()); //name is object so we need first name or last name
        }
        //1. declare a variable
        //2. ->
        //code you want to be called for each element

        ls.forEach(x -> System.out.println(x));
    }
}
