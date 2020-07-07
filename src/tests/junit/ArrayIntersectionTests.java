package tests.junit;

import org.junit.Assert;
import org.junit.Test;
import sessions.collections.arrays.ArrayReadCode;

public class ArrayIntersectionTests {
    ArrayReadCode in = new ArrayReadCode();

//intersection methoud should take 2 int arrays
    //and return a array with the values in both arrays
    //ex: arr1 = {1,4,5}
    //ex: arr2 = {4, 5, 2}
    //result = {4,5}
    //if any of the arrays are empty return null;
    //return empty array -- I ASSUME.
    //if there are no matching values in neither of the array
    //return empty array - {};
    @Test
    public void test1() {
        //arr1 = {}
        //arr2 = {}
        ArrayReadCode in = new ArrayReadCode();
        int [] arr1 = {};
        int [] arr2 = {};
        int [] expected = null;
        int [] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("Two arrays are empty failure: ", expected, actual);
    }

    @Test
    public void test2() {
        //arr1 = {}
        //arr2 = {22};
        ArrayReadCode in = new ArrayReadCode();
        int [] arr1 = {};
        int [] arr2 = {22};
        int [] expected = null;
        int [] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("One array empty test failure: ", expected, actual);

    }

    @Test
    public void test3 () {
        //arr1 = 22;
        //arr2 = {}
        ArrayReadCode in = new ArrayReadCode();
        int [] arr1 = {22};
        int [] arr2 = {};
        int [] expected = null;
        int [] actual = in.intersection(arr1, arr2);

    }

    @Test
    public void noMatchingValuesTest() {
        //arr1 = {20, 24}
        //arr2 = {2}
        ArrayReadCode in = new ArrayReadCode();
        int [] arr1 = {20, 24};
        int [] arr2 = {2};
        int [] expected = {};

        int [] actual = in.intersection(arr1, arr2);
        Assert.assertArrayEquals("No matching array, test failure: ",  expected, actual);

    }

    @Test
    public void twoMatchingValuesTest() {
        //arr1 = {10, 5, 25, 4}
        //arr2 = {3, 4, 60, 10}
        int [] arr1 = {10, 5, 25, 4};
        int [] arr2 = {3, 4, 60, 10};

        int [] expected = {4, 10};
        int [] actual = in.intersection(arr1, arr2);

        //we can loop throuht an expected and actual arrays and compare each values in each index
        //do we have a method that compare the values of array
        Assert.assertArrayEquals("Two matching values: ", expected, actual);
    }

    @Test
    public void oneArrayisNull () {
        //arr1 = null;
        //arr2 = {223, 445};
        int [] arr1 = null;
        int [] arr2 = {223, 445};

        //when your variable is pointing to null, any attempt to use. for the variable will cause a NullPointerexeption
        int [] expected = null;
        int [] actual = in.intersection(arr1, arr2);
        //when your test fails due to runtime exception like NullPointer exeption
        //that test is invalid. We need to fix the test so that it fails on assertion
        //not anywhere else
        //What do you do when a test case in the framework fails?
        //1. I return the test by itself.
        //2. Find if the test is failing due to assertion or before assertion.
        //3. if before assertion I have to fix the test on my side(test framewotk side)
        //4. If in asssertion I have to make sure the expexted result of the test is valid
        //5. and if the expexted result is valid and actual result is not per requirments
        //6. I report the bug.
        Assert.assertArrayEquals("First array is null: ", expected, actual);
    }


}
