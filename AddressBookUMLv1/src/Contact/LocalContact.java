package Contact;

import java.util.UUID;

public class LocalContact extends ContactDetails implements Contact{

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
    public String getEmailAddres(){

    public String getEmailAddress() {
        return email;
    }

}
