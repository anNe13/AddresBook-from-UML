package RemoteReg;

public class CatalogueLoader {
    private RemoteRegistry registry;
    private RemoteCatalogueFactory factory;

    public void run() {
        registry = new RemoteRegistry();
        factory = new RemoteCatalogueFactory(61616);//Vi osäkra på om port-nr ska skrivas här...
    }
}
