package com.example.Banking_system;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BankingSystemTest {

    // Your method that performs the transfer
    public Double transferAmount(Double balance, Double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        return balance - amount;
    }

    // DataProvider supplying test data
    @DataProvider(name = "transferData")
    public Object[][] provideData() {
        return new Object[][]{
                {1000.0, 200.0, 800.0},
                {500.0, 100.0, 400.0},
                {200.0, 50.0, 150.0}
        };
    }

    // Test using DataProvider
    @Test(dataProvider = "transferData")
    public void testTransfer(Double balance, Double amount, Double expectedBalance) {
        Double newBalance = transferAmount(balance, amount);
        Assert.assertEquals(newBalance, expectedBalance, "Balance after transfer should be correct");
    }

    // Test for insufficient funds
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTransferWithInsufficientFunds() {
        Double balance = 1000.0;
        Double amount = 1200.0;
        transferAmount(balance, amount);  // This should throw an exception
    }
}
