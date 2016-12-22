package Command;

import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.ArrayList;
import java.util.List;

public class ListCommand implements Command {
    private Registry reg;
    private RemoteRegistry remote;
    private PrintContactList printContactList;

    @Override
    public void execute() throws InvalidCommandParameterException {
        reg = new Registry();
        remote = new RemoteRegistry();
        printContactList = new PrintContactList();
        List<Contact> bothLists = reg.getContacts();

        bothLists.addAll(remote.getRemoteContacts());
        printContactList.printer(bothLists);

    }


}
