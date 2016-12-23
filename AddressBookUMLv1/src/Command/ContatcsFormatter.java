package Command;

import Console.Console;
import Contact.Contact;
import java.util.List;

public class ContatcsFormatter {
    private Console console;

    public void printer(List<Contact> ContactsToPrint) {
         console = new Console();
        ContactListSorter cListSorter = new ContactListSorter();
        List<Contact> listToSort = cListSorter.sorter(ContactsToPrint);
        for (Contact c : listToSort) {
            console.print(c.getId() + " " + c.getFirstName() + " " + c.getLastName() + " " + c.getEmailAddress());
        }
    }
    public String format(Contact contact){
        String contactDetail;
        contactDetail = contact.getId().toString() + "\n" + contact.getFirstName().toString() +"\n"+ contact.getLastName().toString() +"\n"+ contact.getEmailAddress().toString();

            return contactDetail;
    }
}