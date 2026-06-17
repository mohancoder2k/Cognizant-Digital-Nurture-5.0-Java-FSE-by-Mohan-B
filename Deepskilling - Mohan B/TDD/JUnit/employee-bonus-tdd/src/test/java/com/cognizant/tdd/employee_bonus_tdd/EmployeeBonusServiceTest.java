package com.cognizant.tdd.employee_bonus_tdd;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeBonusServiceTest {

    private EmployeeBonusService eb;
    
    private List<Employee> records;

    @Before
    public void setUp() {
        System.out.println("Setting up test data...");
        eb = new EmployeeBonusService();
        records = eb.empRecords();
    }

    @After
    public void tearDown() {
        System.out.println("Test completed.");
        eb = null;
        records = null;
    }

    // Employee with 100% eligibility
    @Test
    public void shouldReturnTrueForEligibleEmployee() {
        boolean expected = true;
        boolean actual = eb.isElgibleForBonus(records.get(3));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseForNotEligibleEmployee() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(0));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhenYearsOfExperienceIsExactlyTwo() {
        boolean expected = true;
        boolean actual = eb.isElgibleForBonus(records.get(10));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenYearsOfExperienceIsOne() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(2));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenRatingIsAboveFive() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(2));
        eb.printStatusOfEmployee();
        Assert.assertEquals(expected, actual);
    }

    // Exercise 3 - Assertions Demo
    @Test
    public void shouldDemonstrateVariousAssertions() {

        Assert.assertTrue(10 > 5);

        Assert.assertFalse(5 > 10);

        Assert.assertNull(null);

        Assert.assertNotNull(new Employee());

        Assert.assertEquals(5, 2 + 3);
      
    }
}