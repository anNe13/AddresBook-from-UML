package Command;

import Contact.Contact;

public class ContactFormatter {

    public String format(Contact c) {
        return String.format("First name : %s\nSecond name: %s \nMail: %s \nID: %s\n"
                , c.getFirstName(), c.getLastName(), c.getLastName(), c.getEmailAddress(), c.getId());
    }
}
