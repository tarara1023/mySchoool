package tests.runners;
//Runner classes are the classes that can run a specific number of tests.
//ex: choose only test for smoke
//ex: choose tests only for card
//ex: choose tests only for login

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.junit.JunitDemo;
import tests.junit.JunitDemo2;

//@RunWith -> we need provide Suite.class from Junit.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        //List of test classes you want to run in this group
        JunitDemo.class, // all test within JunitDemo are going to be run
        //unless they are ignored
        JunitDemo2.class //al test within JunitDemo2 are going to be run
        //unless a test is ignored
        //all test classes come from our project.

        //Test => if there is time shortage. and the whole team is relying on me
        //to do the the testing and give a green light to go production
        //First Iam going to work on its grouping and prioritizing the failing tests.
        //By grouping you might be finding the issue for all 100 tests immediatly.
        //Bc all 100 tests coukd be failing due to one functionality
        //so there are 100 tests that are testing one functionality.in this case I will report
        //to the devs and ask them to fix that functionality

        //But if all 100 tests are different functionalities I will stil group and prioritize
        //and report to the team
        //Will definetley seek for help from other team mates to debug the issues.
        //If no help available, will check how critical the issues are.
        //If issues are critical I will not give the green light unless the root cause is not detected.
        //if the issue is not critical we will discuss and evaluate the issue with whole team.
})





public class SmokeTestRunner {

}
