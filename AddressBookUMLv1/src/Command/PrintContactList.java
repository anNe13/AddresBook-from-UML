package Command;

import Console.Console;
import Contact.Contact;

import java.util.ArrayList;
import java.util.List;

public class PrintContactList {
    private Console console;

    public void printer(List<Contact> ContactsToPrint) {
         console = new Console();
        for (Contact c : ContactsToPrint) {
            console.print(c.getId() + " " + c.getFirstName() + " " + c.getLastName() + " " + c.getEmailAddress());
        }
    }
}
