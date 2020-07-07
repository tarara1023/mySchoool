package sessions.operators.cimparissons;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class ComparisonOperator {

    public static void main(String[] args) {

        int ageLimit = 60;
        int userAge = 65;
        System.out.println("Is user a senior? " + (userAge >= ageLimit));

        double priceOfACake = 7.99;
        double priceOfTheJuice = 7.99;

        System.out.println("Are the two item prices equal? " + (priceOfACake == priceOfTheJuice));

        double priceOfTheOnePoundApple = 1.99;
        System.out.println("Are apples and cake the same price? " + (priceOfACake == priceOfTheOnePoundApple));





    }


}
