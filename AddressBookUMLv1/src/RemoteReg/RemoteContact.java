package RemoteReg;

import Contact.Contact;
import Contact.ContactDetails;

public class RemoteContact extends ContactDetails implements Contact {

    private String id;

    public RemoteContact(){}
    public RemoteContact(String id, String firstName, String lastName, String email) {

        firstName = this.getFirstName();
        lastName = this.getLastName();
        email = this.getEmailAddress();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return this.getFirstName();
    }

    public String getLastName() {
        return this.getLastName();
    }

    public String getEmailAddress() {
        return this.getEmailAddress();
    }
}
