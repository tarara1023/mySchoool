package tests.runners;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.junit.ArrayIntersectionTests;
import tests.junit.JunitDemo;
import tests.junit.JunitDemo2;
import tests.junit.TestConverter;
import tests.testNG.TestNGDemo1;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestNGDemo1.class,
        ArrayIntersectionTests.class,
        JunitDemo.class,
        JunitDemo2.class,
        TestConverter.class
        //we can have classes with the same name in different packeges
        //in the same package classses with duplicates are not allowed


})




public class RegressionRunner {
    //in Junit how can we run a before annotation(setUp steps)
    //@BeforeClass -> in the runner will run the setUp actions
    //Only once before the test suite

    @BeforeClass
    public static void setUp() {
        System.out.println("Selenium open chrome");
        System.out.println("selenium go to amazom.com");
        System.out.println("Slelenium make sure my window is maximized");
    }

}





