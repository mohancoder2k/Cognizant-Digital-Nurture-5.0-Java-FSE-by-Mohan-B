package com.cognizant.loan.DummyData;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.loan.Entity.Loan;
import java.util.ArrayList;
import java.util.List;

public class LoanDataset {

    public static List<Loan> generateRecords() {
        List<Loan> records = new ArrayList<>();
        records.add(mock("H00987987972342", "car", 400000.0, 3258.0, 18));
        records.add(mock("H00987987972343", "home", 2500000.0, 21500.0, 120));
        records.add(mock("H00987987972344", "personal", 150000.0, 4500.0, 36));
        records.add(mock("H00987987972345", "education", 800000.0, 7200.0, 48));
        records.add(mock("H00987987972346", "car", 650000.0, 5400.0, 24));
        
        return records;
    }

    public static Loan mock(String number, String type, Double loanAmount, Double emi, Integer tenure) {
        return Loan.builder()
                .number(number)
                .type(type)
                .loan(loanAmount)
                .emi(emi)
                .tenure(tenure)
                .build();
    }
}