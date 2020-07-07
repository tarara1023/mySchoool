package tests.testNG;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {



        //Tests in TestNG can be grouped so that we can choose
        //which tests to run based on the groups
        //ex: I have 500 test cases(tc)
        //100 of them are chekout tests -> make these tests one group
        //by using groups feature in TestNG

    //As long as one of the groups match with the xml group test will run

        @Test(groups = {"checkout", "smoke", "regression"})
        public void test1() {
            System.out.println("Checkout Test One");
        }

        @Test(groups = {"checkout", "regression"})
    public void test2() {
            System.out.println("Checkout Test Two");
        }

        @Test(groups = {"search", "regression"})
    public void test4() {
            System.out.println("Search test1");
        }

}
