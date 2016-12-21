package Command;

import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.ArrayList;

public class ListCommand implements Command {
    private Registry reg = new Registry();
    private RemoteRegistry remote = new RemoteRegistry();
    private PrintContactList printContactList = new PrintContactList();

    @Override
    public void execute() throws InvalidCommandParameterException {
        ArrayList<Contact> bothLists = reg.getContacts();
        bothLists.addAll(remote.getRemoteContacts());
        printContactList.printer(bothLists);




    }


}
