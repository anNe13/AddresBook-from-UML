package Command;

import Command.Command;
import Command.InvalidCommandParameterException;
import Console.Console;
import Console.ConsolePrinter;
import Contact.Contact;
import Registry.Registry;

import java.util.List;

public class DeleteContactCommand implements Command {

    private List<String> parameters;
    private Registry registry;
    private ConsolePrinter consolePrinter;

    public DeleteContactCommand(ConsolePrinter consoleprinter, Registry registry, List<String> parameters){
        consoleprinter.print("Delete a contact");
        this.consolePrinter = consoleprinter;
        this.registry = registry;
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
            try {
                registry.deleteContact(parameters.get(0));
            }catch(Exception e){
                consolePrinter.print("Could not find contact " + parameters.get(0) + " in local registry");
            }
        }
    }
}
