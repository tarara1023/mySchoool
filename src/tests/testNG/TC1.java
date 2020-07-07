package tests.testNG;

import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @Test
    void test1() {
        System.out.println("This is test1");
    }
    @Test
    void test2() {
        System.out.println("This is test2");
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
