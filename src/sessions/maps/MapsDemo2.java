package sessions.maps;

import java.util.*;

public class MapsDemo2 {

    public static void main(String[] args) {

        //students first and last Name mapped with
        //keys - ids, must be unique, lastName - could be duplicated
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Elon Mask");
        studentsMap.put(2, "John Doe");
        System.out.println(studentsMap.get(1));
        //getofDefaul - return the value for the key if the key exist
        //othewise you can choose what it should return
        System.out.println(studentsMap.getOrDefault(2, "Such id doesnt exist"));
        System.out.println(studentsMap.getOrDefault(3, "Such id doesnt exist"));

        //Streams ans Lambdas are new features of Java.
        //they simplify iterating and computing some actions on the collection items

        //KEYSET - method returns a Set of the keys. Set is used here because
        //keys in the map are guaranteed to be unique.

        studentsMap.put(3, "Aiday L");
        studentsMap.put(4, "Ainura");
        studentsMap.put(5, "Akif");


        //Set<Integer> studentIds = new HashSet<>(studentsMap.keySet());
        //use this if need to modify Set
        Set<Integer> studentIds = new HashSet<>(studentsMap.keySet()); //purpose is to get all
        //of the existing Ids
        Iterator <Integer >iter = studentIds.iterator();

        while (iter.hasNext()) {
            int id = iter.next();
            String studentName = studentsMap.get(id);
            System.out.println("student Id : " + id + " STudent name: " + studentName);
        }

        //values return a Collection of the values in the map

        Collection <String> studentNames = studentsMap.values();
        //Collection doesnt have a get method to get the value by indexes.
        for (String value: studentNames) {
            System.out.println(value);
        }

        //ENTRY METHOD

        Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();

        for(Map.Entry<Integer, String> entry: entries) {
            Integer studentId = entry.getKey();
            String name = entry.getValue();
            System.out.println(studentId + " --> " + name);
        }

        //putAll method adds all of the values from the map in the param
        //to the current map
        //if maps contain duplicate keys
        //the key value pair from the map in the param will be used
        //the original one will be overridden
        //overriden
        Map<Integer, String> studentsFromGoogle = new HashMap<>();
        studentsFromGoogle.put(100, "Sundar Pitchai");
        studentsFromGoogle.put(101, "Catherine Courage");
        studentsFromGoogle.put(102, "Eve Andersson");
        studentsFromGoogle.put(1, "Ruth Pora");

        studentsMap.putAll(studentsFromGoogle);
        System.out.println(studentsMap);












    }
}
