package Command;


import Console.ConsolePrinter;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.ArrayList;
import java.util.List;

public class SearchCommand implements Command {
    private Registry registry;
    private RemoteRegistry remoteRegistry;
    String term;

    private RemoteRegistry remote;
    private PrintContactList printContactList;
    public SearchCommand (ConsolePrinter consoleprinter, Registry registry, RemoteRegistry remoteRegistry, String term){
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
        this.term=term;
    }



    public void execute() throws InvalidCommandParameterException {

        List<Contact> temp = null ;
        temp= registry.search(term);
        temp.addAll(remoteRegistry.search(term));
        new PrintContactList().printer(temp);
    }


}