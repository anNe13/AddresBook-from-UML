package Registry;


import Contact.Contact;
import Contact.LocalContact;

import java.util.ArrayList;
import java.util.List;


public class Registry  {//extends LocalContact { we shouldn't exctend LocalContact// NZ

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName, String email ){
        LocalContact contact = new LocalContact(firstName, lastName, email);
        contact.setId(new UniqueIdGenerator().idGenrator()); //here the UUID is set
        contacts.add (contact);
    }

    public List<Contact> getContacts() {
       return contacts;
    }

    public void deleteContact(String id){
        for (Contact contact : contacts){
            if (contact.getId().matches(id)){
                contacts.remove(contact);
            }else
                return;
        }
    }
    public List <Contact> search(String term) {
        List<Contact> tempList = null;
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
    public void load(List<Contact>contacts){ this.contacts= contacts;// varför är den tom? //fixed //NZ

    }
}
