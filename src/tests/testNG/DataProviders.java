package tests.testNG;

import homeworks.read_code.Polindrome;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    //Object array can store any value exept primitives in Java,
    //use wrappers in this case

    @DataProvider(name = "loginTestData")
    public static Object [] [] loginTestDataMethod() {
        return new Object [][] {
                {"johnDoe@gmail.com", "123pass"},
            {"johndoe", "hjrglrhg"},
            {"juliana@gmail.con", "a"},
            {"jigndoe@gmail", "8878"}};
    }
    @DataProvider(name = "polindromTest")
    public static Object [] [] polindromeCheck() {
        return new Object [][] {
                {"kayak", true},
                {"NotKayak", false},
                {"Kayak", false}};
    }


    @Test(dataProvider = "polindromTest")
    public void isPolindrome(String word, Boolean expected) {
        Polindrome p = new Polindrome();
        if(expected)
        Assert.assertTrue(p.isPalindrome(word), "Palindrome invalid result, should be a polindrome");
        else
            Assert.assertFalse(p.isPalindrome(word), "Palindrome invalid result, shouldnt be a polindrome");
    }

}
