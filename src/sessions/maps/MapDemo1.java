package sessions.maps;

import java.util.*;

public class MapDemo1 {

    //purpose of the map is to store values that can later be accessed by keys
    //You need one info(key) in order to get info you need.
    //All collections in programing are used as cache. => cashe is a memory that exist while the program is

    public static void main(String[] args) {

        //Map<> = new HashMap<>();
        //Map<> = new TreeMap<>();
        //Map<> = new LinkedHashMap<>();
        //List<Double> = new ArrayList<>();
        //List<Integer> = new LinkedList<>();
        //Set<String> = new HashSet<>();
        //Set<Character> = new LinkedHashSet<>();
        //Set<Float> = new TreeSet<>();

        //1.give the data type of the key
        //2. give the data type of the value
        //Ex: Zipcodes and cities
        //

        Map<Integer, String> zipAndCityMap = new HashMap<>();

        zipAndCityMap.put(60001, "Chicago");
        zipAndCityMap.put(79707, "Midland");
        zipAndCityMap.put(null, "No such zip");
        zipAndCityMap.put(19115, "Philadelphia");
        zipAndCityMap.put(15221, "Pittsburgh");
        zipAndCityMap.put(23450, "Virginia");
        zipAndCityMap.put(55102, "St. Paul");

        if(zipAndCityMap.containsKey(600))
            System.out.println(true);

        System.out.println(zipAndCityMap); //? -> Key Value Pairs(Map)
        //remove
        zipAndCityMap.remove(79707);
        System.out.println(zipAndCityMap);

//        Set <Integer> zip = zipAndCityMap.keySet();
        Iterator <Integer> iter = zipAndCityMap.keySet().iterator();
//        while(iter.hasNext()) {
//            int zip1 = iter.next();
//            String city = zipAndCityMap.get(zip1);
//
//            System.out.println(zip1 + " " + city);
//        }


        //Write an app or feature that will give me a meaning for the word
        //given the word please give me the meaning.
        //put can also be used to update the value of the key.
        Map<String,String> wordsMeanings = new HashMap<>();
        wordsMeanings.put("paradox", "Something strange");
        wordsMeanings.put("Java",  "Open Source object oriented programming language");
        wordsMeanings.put("put", "is method that adds a new Key Value pair to the map");
        wordsMeanings.put("SoftSkills", "A class held on Saturday where we learn about company software dev methodologies");


        System.out.println(wordsMeanings);
        if(wordsMeanings.remove("paradox") == null) {
            System.out.println("Warn - the word thst is trying to be deleted doesnt exist");
        }

        Map<Integer, List<Double>> firmTransactionMap = new HashMap<>();
        //Firms => 1, List<Double>($100, $222, $99)
        //      => 2, List<Double> ($50, $20)
        //      => 3.

        List <Double> firmTransactions = new ArrayList<>(Arrays.asList(110.0, 222.0, 99.0));
        List <Double> firm2Transactions = new ArrayList<>(Arrays.asList(50.0, 20.0));
        List <Double> firm3Transactions = new ArrayList<>(Arrays.asList(20.0));

        firmTransactionMap.put(1, firmTransactions);
        firmTransactionMap.put(2, firm2Transactions);
        firmTransactionMap.put(3, firm3Transactions);

        System.out.println(firmTransactionMap);



        //Maps can have other collections as values or keys.
        //Collections are generally not used as keys.

        //diff between get method in map and list
        //when searching for a specific value list might require you to loop through th it. bc we dont normally know
        //the indexes
        //Map is super convenient in getting a specific value bc the key is also known

        String stPal = zipAndCityMap.get(55102);
        System.out.println(stPal);
        System.out.println(zipAndCityMap.get(23450));
        System.out.println(wordsMeanings.get("paradox"));
        //misspelling will give the null.
        //case sensitive.
        //100% match is required.
        System.out.println(wordsMeanings.get("paradok"));
        System.out.println(firmTransactionMap.get(2));


        double trans = firmTransactionMap.get(1).get(1);
        System.out.println(trans);
        System.out.println(firmTransactionMap.get(2).get(0));
       firmTransactionMap.get(3).add(79.9);
       firm3Transactions.add(78.88);
        System.out.println(firmTransactionMap);

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John Doe");
        students.get(1);





    }
}
