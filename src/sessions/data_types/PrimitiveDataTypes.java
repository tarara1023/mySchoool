package sessions.data_types;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        //byte==>data type;
        //age ==> variable
        //name of my container

        byte age = 77;

        byte weight = 120;

        byte height = 110;

        byte numberOfStudent = 50;

        
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(numberOfStudent);
        System.out.println(age);

        // To display my date of birth. in mm/dd/yyyy
         //one variable will have one data type, and value
        byte month = 7;
        int day = 16;
        short year = 1994;



        //is most widely used type for whole numbers
        int usaPopulation = 350000000;
        System.out.println(usaPopulation);

        //cannot store it in int bc out of bound(range. we have to put l at the end
      //when the number is bigger than the int range
        long worldPopulation = 8000000000l;
        System.out.println(worldPopulation);

        int viewOfYoutubeVideo = 2000000000;
        System.out.println(viewOfYoutubeVideo);

        long gangamStyleYoutubeViews = 350000000000l;
        System.out.println(gangamStyleYoutubeViews);

        System.out.print(month);
        System.out.print("/");
        System.out.print(day);
        System.out.print("/");
        System.out.print(year);
        System.out.println(" ---- This is American Standart");

        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.print(year);
        System.out.println(" ---- This is European Standart");



        byte temperatureInF = -13;
        System.out.print("Temperature right now ");
        System.out.print(temperatureInF);
        System.out.println("F");
        System.out.println();

        double versionOfJava = 1.8; // 15 decimal points.
        float hourlySalary = 60.50f; //will hold more

        System.out.print("Java version I am using to build my program: ");
        System.out.println(versionOfJava);

        System.out.println("Currently I am making " + hourlySalary + "$");

        double gasPrice = 3.111;
        System.out.println("Gas price for one gallon in Chicago $" + gasPrice);


        boolean isJavaFun = true; //means yes
        boolean isFishTasty = false; //noo

        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Java fish tasty? " + isFishTasty);

        boolean amIFrench = false;
        boolean isDevXSchoolBest = true;

        System.out.println("Do you think I Am French? " + amIFrench);
        System.out.println("Do you think DevXSchool is the best? " + isDevXSchoolBest);

        boolean isGasExpensive = true;
        System.out.println("Is Gas Price in Chicago hight? " + isGasExpensive + " the current price: " + gasPrice);

        char gender = 'F'; //'M'
        char dollarSign = '$';
        char ampersand = '&';
        char neutural = 'N';
        char reverse = 'R';
        char drive = 'D';

        System.out.println("What is your gender?" + gender);
        System.out.println("Which currency are you using?" + dollarSign);

        String schoolName = "DevX School";
        System.out.println(schoolName);
        String psySongName = "PSY - Gangam Style";
        String songNameSuffix = "M/V";
        System.out.println(psySongName +" "+ songNameSuffix);

        String carModel = "camry";
        String carMake = "Toyota";
        int carPrice = 13000;
        int miles = 22000;
        boolean isNegotiable = true;
        System.out.println(carMake + " " + carModel + " for $" + carPrice + " miles" + " Is negotiable? " + isNegotiable);












    }
}
