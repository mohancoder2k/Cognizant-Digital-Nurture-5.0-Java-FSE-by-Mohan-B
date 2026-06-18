package com.cognizant.dsa.Ex7.FinancialForecasting;


public class ForecastLogic {
    
    public static double calculate(double p, double r, int n) {
        if (n == 0) {
            return p;
        }
        return calculate(p * (1 + r), r, n - 1);
    }
}