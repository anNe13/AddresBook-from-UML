package RemoteReg;

import Contact.Contact;

import java.util.List;

public class RemoteCatalogueFactory {

    private int defaultPort;

    RemoteCatalogueFactory(int port){
        this.defaultPort = port;
    }

    public RemoteCatalogueProxy create(String host){
       AtomicRemoteCatalogueProxy atomicremotecatalogueproxy = new AtomicRemoteCatalogueProxy(host,defaultPort);
       return atomicremotecatalogueproxy;
    }


}
