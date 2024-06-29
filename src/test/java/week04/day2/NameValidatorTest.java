package week04.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();

    @Test
    void testValidNameTrue() {
        assertTrue(nameValidator.isValidName("John Doe"));
        assertTrue(nameValidator.isValidName("John F. Kennedy"));
        assertTrue(nameValidator.isValidName("Donald J.   Trump "));
    }

    @Test
    void testValidNameFalse() {
        assertFalse(nameValidator.isValidName("John"));
        assertFalse(nameValidator.isValidName("john F. Kennedy"));
        assertFalse(nameValidator.isValidName("Donald J.   trump "));
    }
}