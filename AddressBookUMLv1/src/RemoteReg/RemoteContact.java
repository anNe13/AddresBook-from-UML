package RemoteReg;

import Contact.Contact;
import Contact.ContactDetails;

public class RemoteContact extends ContactDetails implements Contact {

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
