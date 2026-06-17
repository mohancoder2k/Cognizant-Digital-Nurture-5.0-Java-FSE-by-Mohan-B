package com.cognizant.tdd.AdvancedJunitExercises;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class EmployeeBonusServiceTest {

    private EmployeeBonusService eb;
    private List<Employee> records;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up test data...");
        eb = new EmployeeBonusService();
        records = eb.empRecords();
    }

    @AfterEach
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

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseForNotEligibleEmployee() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(0));

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhenYearsOfExperienceIsExactlyTwo() {
        boolean expected = true;
        boolean actual = eb.isElgibleForBonus(records.get(10));

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenYearsOfExperienceIsOne() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(2));

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseWhenRatingIsAboveFive() {
        boolean expected = false;
        boolean actual = eb.isElgibleForBonus(records.get(2));

        assertEquals(expected, actual);
    }

    
    @Test
    public void shouldDemonstrateVariousAssertions() {

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNull(null);

        assertNotNull(new Employee());

        assertEquals(5, 2 + 3);
    }
}