package Command;


import Console.CommandLine;
import Console.ConsolePrinter;
import Registry.Registry;

import java.util.List;

public class AddContactCommand implements Command {
    private Registry registry;
    private List<String> parameters;

    public AddContactCommand(ConsolePrinter consoleprinter, Registry registry, List<String> parameters){
        consoleprinter.print("Add a contact");
        this.parameters = parameters;
        this.registry = registry;
    }


    void validate(){

    }


    @Override
    public void execute() throws InvalidCommandParameterException {
    registry.addContact(parameters.get(0),parameters.get(1),parameters.get(2));
    }
}
