package com.example.Banking_system.services;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    @DataProvider
    public Object[][] getNumbers() {
        return new Object[][] {
                {10,5},
                {100,4},
                {3,7}
        };
    }


    @Test(dataProvider = "getNumbers")
    void givenCalcService_whenAddingNumbers_returnSum(int number1, int number2) {
        //Arrange
        CalculatorService calcService = new CalculatorService();

        //Act
        int actualResult=calcService.add(number1,number2);
        int expectedResult = number1 + number2;
        //Assert
        //add messages to easily identify which methods failed
        Assert.assertEquals(actualResult, expectedResult,"Adding two numbers failed");
    }

    @Test
    void givenCalcService_whenSubtractingPositiveNumbers_returnPositiveDifference() {
        //Arrange
        CalculatorService calcService = new CalculatorService();
        //Act
        int num1=4;
        int num2=3;
        int actualResult=calcService.subtract(num1,num2);
        //Assert
        Assert.assertEquals(actualResult, 1, "Subtraction of Positive numbers failed");
    }
    @Test
    void givenCalcService_whenSubtractingNegativeNumbers_returnNegativeDifference() {
        //Arrange
        CalculatorService calcService = new CalculatorService();
        //Act
        int num1=3;
        int num2=4;
        int actualResult=calcService.subtract(num1,num2);
        //Assert
        Assert.assertEquals(actualResult, -1, "Subtraction of Negative Numbers failed");
    }


    @Test
    void givenCalcService_whenMultiplyingPositiveNumbers_returnPositiveProduct() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=3;
        int num2=4;
        //Act
        int actualResult=calcService.multiply(num1,num2);
        Assert.assertEquals(actualResult, 12, "Multiplication of Two positive numbers failed");
    }
    @Test
    void givenCalcService_whenMultiplyingNegativeNumbers_returnNegativeProduct() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=-3;
        int num2=4;
        //Act
        int actualResult=calcService.multiply(num1,num2);
        Assert.assertEquals(actualResult, -12, "Multiplication of positive and negative numbers failed");
    }
    @Test
    void givenCalcService_whenMultiplyingNegativeNumbers_returnPositiveProduct() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=-3;
        int num2=-4;
        //Act
        int actualResult=calcService.multiply(num1,num2);
        Assert.assertEquals(actualResult, 12, "Multiplication of Two negative numbers failed");
    }
    @Test
    void givenCalcService_whenMultiplyingByZeroNumbers_returnZeroProduct() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=-3;
        int num2=0;
        //Act
        int actualResult=calcService.multiply(num1,num2);
        Assert.assertEquals(actualResult, 0, "Multiplication of Two negative numbers failed");
    }

    @Test
    void givenCalcService_whenDividingPositiveNumbers_returnPositiveQuotient() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=12;
        int num2=4;
        //Act
        int actualResult=calcService.divide(num1,num2);
        //Assert
        Assert.assertEquals(actualResult, 3, "Dividing Two positive numbers failed");
    }
    @Test
    void givenCalcService_whenDividingNegativeNumbers_returnPositiveQuotient() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=-12;
        int num2=-4;
        //Act
        int actualResult=calcService.divide(num1,num2);
        //Assert
        Assert.assertEquals(actualResult, 3, "Dividing Two Negative numbers failed");
    }
    @Test
    void givenCalcService_whenDividingNegativeNumber_returnNegativeQuotient() {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=-12;
        int num2=4;
        //Act
        int actualResult=calcService.divide(num1,num2);
        //Assert
        Assert.assertEquals(actualResult, -3, "Dividing Two positive numbers failed");
    }
    @Test
    void givenCalcService_whenDividingByZero_returnArithmeticException() throws ArithmeticException {
        //Assert
        CalculatorService calcService = new CalculatorService();
        int num1=12;
        int num2=0;

        //Assert and Act
        Assert.assertThrows(ArithmeticException.class, () -> calcService.divide(num1, num2));
    }


    @Test
    void givenCalcService_whenModulusOperation_returnsPositiveNumber() {
        //Arrange
        CalculatorService calculatorService= new CalculatorService();
        int num1= 4;
        int num2=2;
        //Act
        int actualResult = calculatorService.mod(num1, num2);

        //Assert
        Assert.assertEquals(actualResult,2,"modulus of positive numbers failed");
    }

    @Test
    void squareRoot() {
    }

    @Test
    void sin() {
    }
}