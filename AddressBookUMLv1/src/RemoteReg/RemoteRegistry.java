package RemoteReg;

import java.util.*;

import Contact.*;

public class RemoteRegistry extends RemoteContact {

    private ArrayList<Contact> remoteContacts = new ArrayList<Contact>();

    private ArrayList<Contact> getContacts() {
        return remoteContacts;
    }

    public ArrayList<Contact> getRemoteContacts() {
        return remoteContacts;
    }

    private ArrayList<Contact> search(String term) {
        ArrayList<Contact> foundList = new ArrayList<Contact>();
        for (Contact c : remoteContacts) {

            if (c.getFirstName().toLowerCase().startsWith(term.toLowerCase()) || c.getLastName().toLowerCase().startsWith(term.toLowerCase())) {
                foundList.add(c);
            }

        }
        return foundList;//foundList kan vara null
    }

    private void add(String id, String firtName, String lastName, String email) {
        RemoteContact rContact = new RemoteContact(id, firtName, lastName, email);
        remoteContacts.add(rContact);
    }
}
