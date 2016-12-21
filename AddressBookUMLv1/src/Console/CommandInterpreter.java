package Console;

import Command.Command;
import Command.InvalidCommandException;
import Command.InvalidCommandParameterException;
import Command.AddContactCommand;
import Registry.Registry;

import java.util.List;

public class CommandInterpreter {

    public Command interpret(CommandLine commandLine)throws InvalidCommandException {
        Console console = new Console();
        Registry registry = new Registry();

        String command = commandLine.command.toLowerCase();
        String[] commandList = {"add", "list", "delete", "help", "quit", "search"};

        switch (command){
            case "add":
                return new AddContactCommand(console, registry, commandLine.parameters);
                break;
            case "list" :
                return
        }
    }
}
