package com.example.Banking_system;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class HelloTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][] { new String[] { "data1" }, new String[] { "data2" } };
    }

    @Test(dataProvider = "data")
    public void test(String data) {

        String actual = "First line \n Line";
        String expected = "First line \n Line";

        Assert.assertEquals(actual, expected);
    }
}
