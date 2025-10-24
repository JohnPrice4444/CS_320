

public class Contact {
    /*
        This is the class declaration
        This is where the attributes and the constructor are defined
     */

    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String personalAddress;

    public Contact(String id, String firstName, String lastName, String phoneNumber, String personalAddress) {
        /*
            This is the constructor for the class
            This function also checks the validity of the arguments and throws an error
            if they are incorrect
         */
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("id cannot be null or more than 10 characters");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("firstName cannot be null or more than 10 characters");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("lastName cannot be null or more than 10 characters");
        }
        if (phoneNumber == null || phoneNumber.length() != 10) {
            throw new IllegalArgumentException("phoneNumber cannot be null and has to be 10 characters");
        }
        if (personalAddress == null || personalAddress.length() > 30) {
            throw new IllegalArgumentException("address cannot be null or more than 30 characters");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.personalAddress = personalAddress;
    }
}
