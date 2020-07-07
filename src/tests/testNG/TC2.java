package tests.testNG;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @Test
    void test3() {
        System.out.println("This is test3");
    }
    @Test
    void test4() {
        System.out.println("This is test4");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will exevute before every Method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After test method");
    }
}
