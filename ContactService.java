

import java.util.ArrayList;

public class ContactService {
    /*
        This is the class declaration
        This is where the attributes and the constructor are defined
     */
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    public boolean updateContact(Contact contact, String newFirstName, String newLastName,
                         String newPhoneNumber, String newAddress) {
        if (contactList.contains(contact)) {
            contact.firstName = newFirstName;
            contact.lastName = newLastName;
            contact.phoneNumber = newPhoneNumber;
            contact.personalAddress = newAddress;
            return true;
        } else {
            return false;
        }
    }
    public boolean deleteContact(Contact contact) {
        /*
            Method to remove a contact
            Checks if contact exists; if it does, it deletes it
            If it doesn't exist, it returns the Boolean false value
         */
        if (contactList.contains(contact)) {
            contactList.remove(contact);
            return true;
        } else {
            return false;
        }
    }
    public boolean  addContact(Contact contact) {
        /*
            Method to add a contact
            Checks if the list is empty; if so, it adds the contact because there can't be a repeat
            Checks if contact exists; if it does, it returns the Boolean false value
            If it doesn't exist, it adds the contact
         */
        if (contactList.isEmpty()) {
            contactList.add(contact);
            return true;
        } else {
            for (Contact value : contactList) {
                if (contact.id.equalsIgnoreCase(value.id)) {
                    return false;
                }
            }
            contactList.add(contact);
            return true;
        }
    }
}
