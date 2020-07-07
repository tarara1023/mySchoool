package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }


    @Test (priority = 3)
    public void searchCustomer() {
        System.out.println("This is search customer test");


    }

    @Test (priority = 2)
    public void addCustomer() {
        System.out.println("This is add customer test");

    }
    @Test (priority = 4)
    void teardown() {
        System.out.println("CLosing browser");
    }
}
