
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void testClassConstructor() {
        /*
            This is the test for the Contact class's constructor
            It initializes a test contact
            Then it tests that the values are equal to the values found in the contact
         */
        Contact testContact = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        assertEquals("111", testContact.id);
        assertEquals("John", testContact.firstName);
        assertEquals("Doe", testContact.lastName);
        assertEquals("5555555555", testContact.phoneNumber);
        assertEquals("123 place road", testContact.personalAddress);
    }

    @Test
    public void testBadInputs() {
        /*
            This is the test to make sure the exception are thrown when bad inputs
            are provided to the class's constructor
            It tests that the exception is thrown when a constructor is called with inputs
            that don't satisfy the criteria
         */
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "111",
                    "JohnJohnJohnJohnJohnJohn",
                    "DoeDoeDoeDoeDoeDoeDoeDoe",
                    "555-555-5555555-555-5555555-555-5555555-555-5555",
                    "123 place road123 place road123 place road123 place road123 place road123 place road");
        });
    }
}