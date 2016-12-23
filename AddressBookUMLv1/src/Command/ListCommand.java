package Command;

import Console.*;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;


import java.util.ArrayList;
import java.util.List;

public class ListCommand implements Command {
    private ConsolePrinter consolePrinter = new Console();
    private Registry registry;
    private RemoteRegistry remoteRegistry;

    public ListCommand(Registry registry, RemoteRegistry remoteRegistry) {
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
    }

    public void execute() throws InvalidCommandParameterException {
        List<Contact> bothLists = new ArrayList<>();

        bothLists.addAll(registry.getContacts());
        bothLists.addAll(remoteRegistry.getRemoteContacts());

        if (bothLists.isEmpty()) {
            consolePrinter.print("List is empty");
        }
        else {
            for (Contact c : bothLists)
                consolePrinter.print(new ContactFormatter().format(c));
        }



    }


}
