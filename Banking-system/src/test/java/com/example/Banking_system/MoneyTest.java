package com.example.Banking_system;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


@Test
public class MoneyTest {
    @DataProvider
    public static Object[][] getMoreMoney() {
        return new Object[][] {
                {200, "USD"},
                {20000,"EUR"}
        };
    }
    @Test(dataProvider = "getMoreMoney")
    public void immutableConstructor(int amount, String currency){
        //Arrange
        Money money = new Money( amount,currency);
        //Assert
        assertEquals(money.getAmount(),amount);
        assertEquals(money.getCurrency(), currency);
    }
}
