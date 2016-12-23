package Command;

import Contact.Contact;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

import java.util.List;

public class SearchCommand implements Command {
    private Registry registry;
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
            isValid = false;
            throw new InvalidCommandParameterException("fel antal parameter");
        }
        return isValid;
    }

    public void execute() throws InvalidCommandParameterException {
        if (validate()) {

            List<Contact> searchRes = null;
            searchRes = registry.search(parameters.get(0));
            searchRes.addAll(remoteRegistry.search(parameters.get(0)));
            for (Contact c : searchRes)
                new ContactFormatter().format(c);
        }
    }

}