package com.cognizant.dsa.Ex7.FinancialForecasting;


public class ForecastingApplication {

    public static void main(String[] args) {
        
       
        double p = 1000.0; // Present value / initial investment
        double r = 0.05;   // Growth rate (5%)
        int n = 10;        // Number of years
        
        System.out.println("--- Financial Forecasting ---");
        System.out.println("Initial Amount: $" + p);
        System.out.println("Growth Rate: " + r);
        System.out.println("Years: " + n);
        
       
        double result = ForecastLogic.calculate(p, r, n);
        
        System.out.println("\nPredicted Future Value: $" + result);
    }
}