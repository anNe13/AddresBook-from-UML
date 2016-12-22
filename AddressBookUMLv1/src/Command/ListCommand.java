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
    private List<String> parameters;

    private RemoteRegistry remote;
    private ContactListSorter printContactList;
    public ListCommand (ConsolePrinter consoleprinter, Registry registry, RemoteRegistry remoteRegistry, List<String> parameters){
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
    }

    boolean validate() {
        boolean isValid = true;
        if (parameters.size() != 0) {
            isValid = false;
            throw new InvalidCommandParameterException("fel antal parameter");
        }
        return isValid;
    }


    public void execute() throws InvalidCommandParameterException {
        if (validate()) {
            ContatcsFormatter contatcsFormatter = new ContatcsFormatter();
            List<Contact> bothLists = registry.getContacts();
            bothLists.addAll(remote.getRemoteContacts());

            contatcsFormatter.printer(bothLists);

        }

    }


}
