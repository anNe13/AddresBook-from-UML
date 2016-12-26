package RemoteReg;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class CatalogueClientNZ {

    private Socket socket;
    private String host;
    private int port;
    private List<String> catalogueContacts;
    public List<String> getCatalogueContacts() {return catalogueContacts;}

    CatalogueClientNZ (AtomicRemoteCatalogueProxyNZ cc)
    {
        this.host=cc.getHost();
        this.port=cc.getPort();
        connect();
        sendRequest("getall");
        sendRequest("exit");
        catalogueContacts=waitForResponse();
        disconnect();
    }
    public void connect() {
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
        }
    }
    public void sendRequest(String request) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            printWriter.println(request);
            //PrintWriter writer = new PrintWriter(socket.getOutputStream());
           // writer.println(request);
            System.out.println("a1");
        } catch (IOException | NullPointerException e) {
        }
    }
    public List<String> waitForResponse() {

        List<String> catalogueContacts= new ArrayList<>();
        try {

            //BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //for (String line = bufferedReader.readLine(); !line.equals("EOF"); line = bufferedReader.readLine()) {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                catalogueContacts.add(line);
            }
        } catch (IOException | NullPointerException e) {
        }
        return catalogueContacts;
    }

    public void disconnect() {
        try {
            socket.close();
        } catch (IOException | NullPointerException e) {
        }
    }
}