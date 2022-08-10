package br.com.alura.escola.dominio.indicacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoTimesTwoShouldEqualsFour() {
        int resultExpected = 4;
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int actualResult = simpleCalculator.add(2, 2);
        assertEquals(resultExpected, actualResult);
        assertNotEquals(10, actualResult);
        assertTrue(resultExpected == actualResult && actualResult < 26);
        //assertFalse();
        //assertNull();
        //assertNotNull();
    }

    @Test
    void threeTimesSevenShouldEqualsTen() {
        int resultExpected = 21;
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int actualResult = simpleCalculator.add(7, 3);
        assertEquals(resultExpected, actualResult);
        assertNotEquals(10, actualResult);
        assertTrue(resultExpected == actualResult && actualResult < 26);
        //assertFalse();
        //assertNull();
        //assertNotNull();
    }
}