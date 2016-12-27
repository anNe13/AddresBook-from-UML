package Command;

import Console.*;
import Registry.Registry;

import java.util.List;

public class DeleteContactCommand implements Command {

    private List<String> parameters;
    private Registry registry;
    private ConsolePrinter consolePrinter = new Console();

    public DeleteContactCommand(Registry registry, List<String> parameters) {
        this.registry = registry;
        this.parameters = parameters;
    }


    boolean validate() {
        boolean isValid = true;
        if (parameters.size() != 1) {
            isValid = false;
            throw new InvalidCommandParameterException();
        }
        return isValid;
    }

    public void execute() throws InvalidCommandParameterException {
        if (validate()) {
            try {
                registry.deleteContact(parameters.get(0));
            } catch (InvalidCommandParameterException e) {
                consolePrinter.print("Could not find contact " + parameters.get(0) + " in local registry");
            }
        }
    }
}
