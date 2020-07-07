package tests.junit;

import org.junit.Assert;
import org.junit.Test;
import sessions.methods.Converter;

public class TestConverter {

    @Test
    public void test1() {

        Converter convert = new Converter();
        int f = (int)convert.convertCtoF(30);

        //first put expected result, second actual
        //result from the method
        Assert.assertEquals(86, f);

    }
    @Test
    public  void test2() {
        Converter con = new Converter();
        int km = (int)con.convertMileToKm(40);

        Assert.assertEquals(64, km);
    }


}
