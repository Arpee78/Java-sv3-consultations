package week04.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers = new Numbers();

    @Test
    void testSumOfDigitsMathStyle() {
        int result = numbers.sumOfDigitsMathStyle(5342);
        assertEquals(14, result);
    }

    @Test
    void testSumOfDigitsProgrammerStyle() {
        int result = numbers.sumOfDigitsProgrammerStyle(5342);
        assertEquals(14, result);

    }

    @Test
    void testSumOfDigitsProgrammer2Style() {
        int result = numbers.sumOfDigitsProgrammer2Style(5342);
        assertEquals(14, result);

    }
}