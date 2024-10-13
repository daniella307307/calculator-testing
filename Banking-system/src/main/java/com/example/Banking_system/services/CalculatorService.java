package com.example.Banking_system.services;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        if (b== 0){
            throw new ArithmeticException("division by zero");
        }
        return a/b;
    }
    public int mod(int a, int b) {
        return a % b;
    }
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
    public double sin(double a){
        return Math.sin(a);
    }

}
