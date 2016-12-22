package Command;

import Command.Command;
import Console.ConsolePrinter;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;
import Command.InvalidCommandParameterException;

import java.util.ArrayList;
import java.util.List;

public class ListCommand implements Command {
    private Registry registry;
    private RemoteRegistry remoteRegistry;

    private RemoteRegistry remote;
    private PrintContactList printContactList;
    public ListCommand (ConsolePrinter consoleprinter, Registry registry, RemoteRegistry remoteRegistry){
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
    }

                              @Override
    public void execute() throws InvalidCommandParameterException {

        printContactList = new PrintContactList();
        List<Contact> bothLists = registry.getContacts();

        bothLists.addAll(remote.getRemoteContacts());
        printContactList.printer(bothLists);

    }


}
