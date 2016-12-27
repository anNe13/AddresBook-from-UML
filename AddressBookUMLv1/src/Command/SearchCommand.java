package Command;

import Console.Console;
import Console.ConsolePrinter;
import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.ArrayList;
import java.util.List;

public class SearchCommand implements Command {
    private Registry registry;
    private ConsolePrinter consolePrinter = new Console();
    private RemoteRegistry remoteRegistry;
    String term;
    private List<String> parameters;

    private RemoteRegistry remote;

    public SearchCommand(Registry registry, RemoteRegistry remoteRegistry, List<String> parameters) {
        this.registry = registry;
        this.remoteRegistry = remoteRegistry;
        this.term = term;
        this.parameters = parameters;
    }

    boolean validate() {
        boolean isValid = true;
        if (parameters.size() != 1) {
            throw new InvalidCommandParameterException();
        }
        return isValid;
    }

    public void execute() throws InvalidCommandParameterException {
        if (validate()) {

            List<Contact> searchRes = new ArrayList<>();
            searchRes.addAll(registry.search(parameters.get(0)));
            searchRes.addAll(remoteRegistry.search(parameters.get(0)));
            if (searchRes.isEmpty()){
                consolePrinter.print("empty list");}
            else{
            for (Contact c : searchRes) {
                consolePrinter.print(new ContactFormatter().format(c));}
            }
        }
    }

}