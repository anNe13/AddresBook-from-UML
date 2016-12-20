package RemoteReg;

import Contact.Contact;
import Contact.ContactDetails;

class RemoteContact extends ContactDetails implements Contact {

   // public RemoteContact(){}
    public RemoteContact(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private String id;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return email;
    }
}
