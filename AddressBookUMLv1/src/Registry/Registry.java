package Registry;


import Contact.Contact;
import Contact.LocalContact;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Registry  extends LocalContact {

    private List<Contact> contacts = new ArrayList<Contact>();

    public void addContact (String firstName, String lastName, String email ){
        LocalContact contact= new LocalContact(firstName, lastName, email);
        contact.setId(new UniqueIdGenerator().idGenrator());
        contacts.add (contact);


//push
    }
    public ArrayList<LocalContact> getContacts () {
       return fsd;
    }
    public void deleteContact (String id){}
    public  ArrayList <LocalContact> search (String term) {

    }
    public void load (contacts){}
}
