package Registry;
import Contact.Contact;
import java.io.*;
import Console.ConsolePrinter;
import java.util.List;
import Console.Console;

public class RegistryPersisterAntonReMake {

        private String filePath = "adressbokserver.csv";
        private Registry registry;
        private ConsolePrinter consolePrinter = new Console();

    public RegistryPersisterAntonReMake(Registry registry){
        this.registry = registry;
    //    load();
    }

        public void save(){
            try {
                FileOutputStream storeToFile = new FileOutputStream(filePath);
                ObjectOutputStream register = new ObjectOutputStream(storeToFile);
            }catch (IOException ex){
                ex.printStackTrace();
            }

        }
        public void load(){
            try {
                List<Contact> tempRegister = null;
                FileInputStream getFromFile = new FileInputStream(filePath);
                ObjectInputStream register = new ObjectInputStream(getFromFile);
                try {
                    tempRegister =(List<Contact>)register.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
