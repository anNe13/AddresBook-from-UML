package RemoteReg;

import java.util.*;

import Contact.*;

public class RemoteRegistry extends RemoteContact {

    private List<RemoteContact> remoteContacts;

    private List<RemoteContact> getContacts() {
        return remoteContacts;
    }

    public List<RemoteContact> getRemoteContacts() {
        return remoteContacts;
    }

    public List<Contact> search(String term) {
        remoteContacts = new ArrayList<>();
        List<Contact> foundList = new ArrayList<>();
        for (RemoteContact remoteContact : remoteContacts) {

            if (remoteContact.getFirstName().toLowerCase().startsWith(term.toLowerCase())
                    || remoteContact.getLastName().toLowerCase().startsWith(term.toLowerCase())) {
                foundList.add(remoteContact);
            }
        }
        return foundList;//foundList kan vara null
    }

    public void add(String id, String firtName, String lastName, String email) {
        RemoteContact rContact = new RemoteContact(id, firtName, lastName, email);
        remoteContacts.add(rContact);
    }
}
