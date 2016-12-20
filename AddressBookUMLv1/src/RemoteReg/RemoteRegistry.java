package RemoteReg;

import java.util.*;

import Contact.*;

public class RemoteRegistry extends RemoteContact {

    private List<Contact> remoteContacts = new ArrayList<Contact>();

    private List<Contact> getContacts() {
        return remoteContacts;
    }

    private List<Contact> search(String term) {
        List<Contact> foundList = new ArrayList<Contact>();
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
