package com.cognizant.tdd.AdvancedJunitExercises;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EvenCheckerTest {

    /**
     * Rigorous Test :-)
     */
	private EvenChecker ec;
	@BeforeEach
	public void setup() {
		 ec = new EvenChecker();
	}
	

    @ParameterizedTest
    @ValueSource(ints = {-2,4,6,8,10})
	@Order(1)
    public void shouldReturnTrueForEvenNumbers(int num) {
        assertTrue(ec.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
	@Order(3)
    public void shouldReturnFalseForOddNumbers(int num) {
        assertFalse(ec.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
	@Order(2)
    public void shouldReturnTrueForZero(int num) {
        assertTrue(ec.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "4", "6", "8"})
	@Order(4)
    public void shouldReturnTrueForEvenStrings(String str) {
        assertTrue(ec.isEven(Integer.parseInt(str)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "3", "5", "7"})
	@Order(6)
    public void shouldReturnFalseForOddStrings(String str) {
        assertFalse(ec.isEven(Integer.parseInt(str)));
    }

    @ParameterizedTest
    @ValueSource(chars = {'1', '3', '5'})
	@Order(5)
    public void shouldReturnFalseForOddCharacters(char ch ) {
        assertFalse(ec.isEven(ch - '0'));
    }

}
