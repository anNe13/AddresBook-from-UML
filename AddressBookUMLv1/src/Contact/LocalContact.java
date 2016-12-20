package Contact;

import sun.misc.UUDecoder;

import java.util.UUID;

public class LocalContact extends ContactDetails implements Contact{

    private UUID id;
    public void setId(UUID id) {
        this.id = id;
    }


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

    public LocalContact(){}
    public LocalContact (String firstName, String lastName, String email ) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.email= email;

   }
}