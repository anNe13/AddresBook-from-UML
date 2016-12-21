package Command;


import Console.CommandLine;
import Console.ConsolePrinter;
import Registry.Registry;

import java.util.List;

public class AddContactCommand implements Command {
    private Registry registry;
    private CommandLine parameters;

    public AddContactCommand(ConsolePrinter consoleprinter, Registry registry, List<String> parameters){
        consoleprinter.print("h");
        this.registry = registry;

    }


    void validate(){

    }

    @Override
    public void getName() {

    }

    @Override
    public void getDescription() {

    }

    @Override
    public void execute() throws InvalidCommandParameterException {

    }
}
