package tests.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnDemo {
    //TestNG has an ability to run a test based on the result of another test
    //Its bad practice because ----> every test should be self independent, no dependencies on other test results.
    //False reporting -> 2 failures when there actually was only one failure

    @Test(dependsOnMethods = {"test2"})
    public void printMessageTest() {
        System.out.println("Test PrintMessage");
    }

    @Test(dependsOnMethods = {"test3"})
    public void test2() {
        System.out.println("Depends on demo test 2");

    }

    @Test
    public void test3() {
        System.out.println("test3");
    }
}
