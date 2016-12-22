package Contact;

import java.util.UUID;

public class LocalContact extends ContactDetails implements Contact {

    private UUID id;

    public LocalContact(){}

    public LocalContact(String firstName, String lastName, String email) {
        firstName = getFirstName();
        lastName = getLastName();
        email = getEmailAddress();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getId() {
        return String.valueOf(id);
    }

    //public LocalContact(){} // behövs inte
}