package Command;

import Console.*;
import Registry.Registry;
import java.util.List;

public class AddContactCommand implements Command {
    private ConsolePrinter consolePrinter = new Console();
    private Registry registry;
    private List<String> parameters;

    public AddContactCommand(Registry registry, List<String> parameters) {
        this.parameters = parameters;
        this.registry = registry;
    }


    boolean validate() {
        boolean isValid = true;
        if (parameters.size() != 3) {
            isValid = false;
            throw new InvalidCommandParameterException("fel antal parameter");
        }
        return isValid;
    }


    public void execute() throws InvalidCommandParameterException {
        if (validate()) {
            registry.addContact(parameters.get(0), parameters.get(1), parameters.get(2));
            consolePrinter.print("Contact added");
        }
    }

}

