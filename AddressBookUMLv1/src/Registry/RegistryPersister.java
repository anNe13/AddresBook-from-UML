package Registry;


import Contact.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegistryPersister {
    File filePath;
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
                tempRegister =(ArrayList<Contact>)register.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
