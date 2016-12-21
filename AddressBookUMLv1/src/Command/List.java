package Command;

import Console.Console;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.ArrayList;

public class List implements Command {
    Registry reg = new Registry();
    RemoteRegistry Rreg = new RemoteRegistry();
    PrintContactList pcl = new PrintContactList();

    @Override
    public void execute() throws InvalidCommandParameterException {
        ArrayList<Contact> bothLists = reg.getContacts();
        bothLists.addAll(Rreg.getRemoteContacts());
        pcl.printer(bothLists);




    }


}
