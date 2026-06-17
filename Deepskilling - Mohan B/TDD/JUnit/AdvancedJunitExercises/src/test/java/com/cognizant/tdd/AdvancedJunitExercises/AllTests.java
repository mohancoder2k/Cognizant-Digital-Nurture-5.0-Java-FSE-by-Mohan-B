package com.cognizant.tdd.AdvancedJunitExercises;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class, EmployeeBonusServiceTest.class})
public class AllTests {

}
