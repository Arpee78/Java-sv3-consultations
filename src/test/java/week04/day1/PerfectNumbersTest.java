package week04.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers = new PerfectNumbers();

    @Test
    void isPerfectNumberTrue() {
        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(28));
        assertTrue(perfectNumbers.isPerfectNumber(496));
        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(33_550_336));
    }

    @Test
    void isPerfectNumberFalse() {

        boolean result = perfectNumbers.isPerfectNumber(8127);
        assertFalse(result);
    }
}