import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ContactServiceTest {

    @Test
    public void testAddContactPass() {
        /*
            This is the test for the addContact method
            It initializes a contactService object and creates a test contact
            Then it tests that the method returns true when the addContact method is run
         */
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        assertTrue(testContactService.addContact(testContact_1));
    }
    @Test
    public void testAddContactFail() {
        ContactService testContactService = new ContactService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact testContact_1 = new Contact(
                    "111",
                    "John",
                    null,
                    "5555555555",
                    "123 place road");
        });
    }

    @Test
    public void testDeleteContactPass() {
        /*
            This is the test for the deleteContact method
            It initializes a contactService object and creates a test contact
            Then it tests that the method returns true when the deleteContact method is run
         */
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        ContactService testContactService = new ContactService();
        testContactService.addContact(testContact_1);
        assertEquals(1, testContactService.contactList.size());
        testContactService.deleteContact(testContact_1);
        assertEquals(0, testContactService.contactList.size());
    }
    @Test
    public void testDeleteContactFail() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        testContactService.addContact(testContact_1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                testContactService.deleteContact(null));
    }

    @Test
    public void testUpdateContactFirstNamePass() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
        "111",
        "John",
        "Doe",
        "5555555555",
        "123 place road");
        testContactService.addContact(testContact_1);
        testContactService.updateContactFirstName(testContact_1, "Sanji");
        assertEquals("Sanji", testContact_1.firstName);
    }
    @Test
    public void testUpdateContactFirstNameFail() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        testContactService.updateContactFirstName(testContact_1, null));
    }
    @Test
    public void testUpdateContactLastNamePass() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        testContactService.addContact(testContact_1);
        testContactService.updateContactLastName(testContact_1, "Vinsmoke");
        assertEquals("Vinsmoke", testContact_1.lastName);
    }
    @Test
    public void testUpdateContactLastNameFail() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        testContactService.updateContactLastName(testContact_1, null));
    }
    @Test
    public void testUpdateContactPhoneNumberPass() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        testContactService.addContact(testContact_1);
        testContactService.updateContactPhoneNumber(testContact_1, "4444444444");
        assertEquals("4444444444", testContact_1.phoneNumber);
    }
    @Test
    public void testUpdateContactPhoneNumberFail() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        testContactService.updateContactPhoneNumber(testContact_1, null));
    }
    @Test
    public void testUpdateContactPersonalAddressPass() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        testContactService.addContact(testContact_1);
        testContactService.updateContactPersonalAddress(testContact_1, "000 all blue");
        assertEquals("000 all blue", testContact_1.personalAddress);
    }
    @Test
    public void testUpdateContactPersonalAddressFail() {
        ContactService testContactService = new ContactService();
        Contact testContact_1 = new Contact(
                "111",
                "John",
                "Doe",
                "5555555555",
                "123 place road");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        testContactService.updateContactPersonalAddress(testContact_1, null));
    }
}