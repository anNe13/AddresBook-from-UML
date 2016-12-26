package RemoteReg;



public class RemoteCatalogueFactoryNZ {

    private int defaultPort;
    private CatalogueLoaderNZ catalogueLoader;

    public RemoteCatalogueFactoryNZ(CatalogueLoaderNZ catalogueLoader) {
        this.catalogueLoader = catalogueLoader;
        RemoteCatalogueFactory(61616);
        System.out.println("q2");
        create("localhost", defaultPort);
        System.out.println("q3");
    }

    public void RemoteCatalogueFactory(int port) {
        defaultPort=port;
    }

    public void create(String host, int port) {
        System.out.println("q4");
        AtomicRemoteCatalogueProxyNZ atomicRemoteCatalogueProxy = new AtomicRemoteCatalogueProxyNZ(host, port);
        catalogueLoader.loadRemoteContacts(atomicRemoteCatalogueProxy.getContacts());
    }

}
