package Contact;

import java.util.UUID;

public class LocalContact extends ContactDetails implements Contact{
// test
    private UUID id;

    public String getId() {
        return String.valueOf(id);
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