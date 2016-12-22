package Command;

import Command.Command;
import Console.ConsolePrinter;
import Command.InvalidCommandParameterException;
import Registry.Registry;
import java.util.List;

public class AddContactCommand implements Command {
    private Registry registry;
    private List<String> parameters;

    public AddContactCommand(ConsolePrinter consoleprinter, Registry registry, List<String> parameters) {
        consoleprinter.print("Add a contact");
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
        }
    }

}

