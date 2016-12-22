package Command;


import Console.ConsolePrinter;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;
//import ContactsFormatter;

import java.util.ArrayList;
import java.util.List;

public class SearchCommand implements Command {
    private Registry registry;
    private RemoteRegistry remoteRegistry;
    String term;
    private List<String> parameters;

    private RemoteRegistry remote;
   // private ContactsFormatter printContactList;
    public SearchCommand (ConsolePrinter consoleprinter, Registry registry, RemoteRegistry remoteRegistry, List<String> parameters){
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
        this.term=term;
        this.parameters= parameters;
    }

    boolean validate() {
        boolean isValid = true;
        if (parameters.size() != 1) {
            isValid = false;
            throw new InvalidCommandParameterException("fel antal parameter");
        }
        return isValid;
    }

    public void execute() throws InvalidCommandParameterException {
        if (validate()) {

            List<Contact> temp = null;
            temp = registry.search(parameters.get(0));
            temp.addAll(remoteRegistry.search(parameters.get(0)));
            new ContatcsFormatter().printer(temp);
        }
    }


}