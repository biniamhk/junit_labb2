package se.labb2_junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class TestCalculator {

    Calculator calculator;

    //this runs before each test methods.
    @BeforeEach
    public void beforeEachTest() {
        calculator = new Calculator();
        System.out.println("this runs before each test methods and instantiate calculator object");

    }

    @AfterEach
    public void afterEachtest() {
        System.out.println("Test executed");
    }

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("this runs once before all tests it should be static method");

    }

  @Test
  @DisplayName("testing add method")
    public void testAdd() {
        assertEquals(9, Calculator.addition(1, 8));

    }

    @Test
    @DisplayName("testing subtraction")
    public void testSub() {
        assertNotEquals(3, calculator.subtraction(5, 3));


    }

    @Test
    @Disabled
    public void testMultiplication() {
        assertFalse( calculator.multiplication(5, 1)==3);

    }

    @Test
    @DisplayName("testing division")
    public void testDivision() {
        assertTrue(calculator.division(6, 3) == 2);

    }
}
