package RemoteReg;

import Contact.Contact;

import java.util.List;

public class AtomicRemoteCatalogueProxy implements RemoteCatalogueProxy{


    AtomicRemoteCatalogueProxy (String host, int port){
        CatalogueClient catalogueclient = new CatalogueClient();
    }

    public List<Contact> getContacts() {
        return null;
    }
}
