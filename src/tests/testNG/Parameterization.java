package tests.testNG;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

    //run same test against different set of data
    //ex: Login
    //positive - > johndoe@gmail.com
    //v3ryh@rdpa$$
    //johndoe
    //123ghjy

    //In Junit we will creare new tests for each case with different set of data
    @Test
    public void loginPositiveTest() {
        System.out.println("johndoe@gmail.com");
        System.out.println("v3ryh@rdpa$$");
    }

    @Test
    //params must match the ones in xml file
    @Parameters({"userName", "password"})
    public void loginNegative(String user, String password) {
        System.out.println(user);
        System.out.println(password);

    }

    @Test
    @Parameters({"quantity", "price", "isPrime"})
    public void testWithDoubleDataType(int quantity, double price, boolean isPrime){
        //I want to print out quantity * price
        //and is prime values
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(isPrime);



    }
    @BeforeSuite
    @Parameters("browser")

    public static void beforeSuite(String browser) {
        System.out.println(browser);
    }
}
