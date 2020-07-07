package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo1 {

    //Error message in assertion is the last param in Test Ng
    //And actual param is before expected, where is in Junit oposite

    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("before suite TestNG");
    }
    @AfterSuite
    public static void afterSuite() {
        System.out.println("AfterSuite");
    }

   @Test
    public void test1() {
       System.out.println("Hello TestNG");
       Assert.assertEquals(50, 50);


   }

   @Test
    public void test12() {
        System.out.println("Hello TestNG");
        Assert.assertEquals(53, 53);
    }

    //choose some method not void, try to write some test with testNG

}
