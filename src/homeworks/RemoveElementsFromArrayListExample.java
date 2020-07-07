package homeworks;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {

    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        programmingLanguages.remove(5);
        System.out.println("After remove (5): " + programmingLanguages);

        programmingLanguages.remove("Kotlin");
        System.out.println("After remove Kotlin: " + programmingLanguages);
        List <String> programing = new ArrayList<>(programmingLanguages);
        programmingLanguages.removeAll(programing);
        programmingLanguages.clear();

        System.out.println("After clear: " + programmingLanguages);





    }
}
