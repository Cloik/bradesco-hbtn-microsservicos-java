package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        Double result = calculator.sum(10.0, 5.0);
        assertEquals(15.0, result);
    }

    @Test
    public void numbersNullSumTest() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            calculator.sum(null, 5.0);
        });
        assertEquals("Número 1 e número 2 são obrigatórios.", exception.getMessage());
    }

    @Test
    void subTest() {
        Double result = calculator.sub(10.0, 5.0);
        assertEquals(5.0, result);
    }

    @Test
    void divideTest() {
        Double result = calculator.divide(20.0, 4.0);
        assertEquals(5.0, result);
    }

    @Test
    public void divisionByZeroTest() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
        assertEquals("Divisão por zero não é permitido.", exception.getMessage());
    }

    @Test
    void factorialTest() {
        Integer result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    void integerToBinaryTest() {
        Integer result = calculator.integerToBinary(20);
        assertEquals(10100, result);
    }

    @Test
    void integerToHexadecimalTest() {
        String result = calculator.integerToHexadecimal(170);
        assertEquals("AA", result);
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);

        int result = calculator.calculeDayBetweenDate(date1, date2);

        assertEquals(14, result);
    }
}

