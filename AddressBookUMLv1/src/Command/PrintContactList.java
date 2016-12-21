package Command;

import Console.Console;
import Contact.Contact;

import java.util.ArrayList;

public class PrintContactList {
    Console console = new Console();

    public void printer(ArrayList<Contact> ContactsToPrint) {
        for (Contact c : ContactsToPrint) {
            console.print(c.getId() + " " + c.getFirstName() + " " + c.getLastName() + " " + c.getEmailAddress());
        }

    }
}
