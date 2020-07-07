package tests.junit;

import org.junit.*;
import org.junit.internal.runners.statements.Fail;

public class JunitDemo2 {

    @BeforeClass //runs only one Before the hole test execution of the class
    //(BeforeClass runs once before the test suites(all tests running by one button)
    //Before Class method shod be static
    public static void beforeClassHook() {
        System.out.println("Before Class");


    }
    @AfterClass
    public static void afterClassHook() {
        System.out.println("After Class");
    }

    @Test(timeout = 0)
    public void test1() {
        System.out.println("test1");
        }


    @Before
    public void test2() {
        System.out.println("Before");
    }


    @Ignore //This annotation is used to ignore test. Usually we
    //ignore that are very low priority and non critical, so we come fixing later
    @Test
    public void test3() {
        System.out.println("Test2");
        System.out.println("XXX".charAt(4));
        System.out.println("TEst3 - After Exeption");

    }

    @After
    public void afterHook() {
        System.out.println("After");

    }

    @Test
    public void test4() {
        System.out.println("Test 4");
        int num = 10;
        int num2 = 20;
        int sum = num + num2;
        //assert has many overloaded version
        //methos with same name but different params.What is method overloading
        //long, long
        //String, String
        //assertEquals takes expexted result first  and actual result second
        //expected result comes from requirements
        Assert.assertEquals(30, sum);

    }
    @Test
    public void substringTest() {
        System.out.println("Test 5");
        String str = "DevX School";
        String str2 = str.substring(str.indexOf(" "));
        //We dont see the implementetion of the method, we just dont care what implamantation is

        Assert.assertEquals(" School", str2);
    }

    @Test
    public void indexOfTest() {
        System.out.println("Test 6");
        String str = "Hello World";
        int index = str.indexOf("World");
        Assert.assertEquals(6, index);
        //expected result will come from manual calculation according to BRD

    }

    //we can have miltiple assertions in one test -->
   // All methods in Assert are hard assertions
    //test runs only until the end of the test or first hard assertions failure
    //A lot of the times methods require multiple validation

    @Test
    public void charAtTest() {
        String str = "John Doe";
        char s = str.charAt(str.indexOf(" ") + 1);

        Assert.assertEquals('D', s);

        //All Assertion Methods can take String as a very first parameter
        //That string will be a message of the assertion -> which will be printed out when test fails
        //which helps ud to get an instant grasp(understanding) which test(feature) failed.
        //super helpful when working with  a large set of tests.
    }
        @Test
        public void test10() {
            System.out.println("test 10");
            String str = "DevX School";
            String actual = str.replace('e', '-');
            Assert.assertEquals("String replace method failure","D-vX School", actual);

        }

        @Test
    public void test11() {
            System.out.println("Test 11");
            StringBuilder sb = new StringBuilder("Hello World");
            int actual  = sb.lastIndexOf("o");
            Assert.assertEquals("StringBuilder last IndexOf method failed",7, actual);

        }

        @Test
    public void test12() {
        String str = "Hello";
        boolean actual = str.isEmpty();
        //AssertTrue passses when boolean is True
        Assert.assertTrue("Isempty method failure", actual);
        Assert.assertFalse(actual); //passes when boolean is False;
        }

    }


