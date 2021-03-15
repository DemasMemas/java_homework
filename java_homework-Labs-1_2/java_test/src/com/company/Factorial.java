package com.company;

public class Factorial{
    static double getFactorial(int fact_limit){
        double fact_limit_result = 1;
        for (int i = 1; i < fact_limit + 1; i++){
            fact_limit_result *= i;
        }
        return fact_limit_result;
    }
}
