package tests.junit;

import homeworks.PrintNumberInWord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo {//run button on the class level will run all of the tests inside the class
//test run in alphabetical order of the method names.
    //Rule(Best Testing Practice) ---> Tests must be independent.!!!!!!!!
    //one test result shoud not anyhow affect other tests results.

    @Test//test annotation gives me a result of the below method executed
    //If there a no failures
    //this test will be reported as passed
    public void test1() {

        //run button on the tests method level will run just a single test
        System.out.println("Hello World");
    }

    @Test
    //WHen there is an issue in the method (Exceptions, Assertions)
    //Test will report a failure
    public void failingTestExample() {
        String str = "Hello";
        System.out.println(str.charAt(6));
    }

    @Test
    public void test3() {
        System.out.println("Elon");
        System.out.println(5+10);
        System.out.println(100);
    }

    @Before //will run once before every test
    // before usually called hooks
    //Hook is keyword that represent @Before and @After Annotation
    //Hooks dont have test results
    //An error in the hook will cause an error of the test.
    //Even thoght Hooks and Tests are written separetley
    //Once run button is clicked they are treated as a single test.
    public void beforeHook() {
        System.out.println("About to run a test");
        PrintNumberInWord p = new PrintNumberInWord();

    }

    public void secondBefore() {
        //usually you dont put multiple befores
        System.out.println("Second before");
    }

    @After
    //runs after every test
    public void afterHook() {
        System.out.println("After Hook");
        System.out.println("test execution completed");

    }

}
