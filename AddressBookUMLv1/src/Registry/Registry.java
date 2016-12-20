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
    public List<Contact> getContacts () {
       return contacts;
    }
    public void deleteContact (String id){
        for (Contact contact : contacts){
            if (contact.getId().matches(id)){
                contacts.remove(contact);
            }else
                return;
        }
    }
    public  List <Contact> search (String term) {
        ArrayList<Contact> tempList = null;
        for (Contact contact : contacts){
            if (contact.getFirstName().startsWith(term)){
                tempList.add(contact);
            }else if (contact.getLastName().startsWith(term)){
                tempList.add(contact);
            }else
                return null;
        }
        return tempList;
    }
    public void load (contacts){

    }
}
