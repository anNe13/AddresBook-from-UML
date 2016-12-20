package RemoteReg;

public class CatalogueLoader {

    public void run(){
        RemoteRegistry registry =  new RemoteRegistry();
        RemoteCatalogueFactory factory = new RemoteCatalogueFactory(61616);//Vi osäkra på om port-nr ska skrivas här...
    }
}
