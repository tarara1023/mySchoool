package homeworks;

public class CoolSchoolCooler {

    public static void main(String[] args) {


        int counter = 0;
        int index = 0;



        String cooler = "Cool School Cooler";

        while (counter < cooler.length()) {

            if (cooler.charAt(counter) == 'o')
                index++;
            counter++;
        }
        System.out.println(index);




    }
}
