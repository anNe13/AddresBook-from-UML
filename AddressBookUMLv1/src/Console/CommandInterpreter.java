package Console;

import Command.Command;
import Command.InvalidCommandException;
import Command.Methods.AddContactCommand;
import Registry.Registry;

import java.util.List;

public class CommandInterpreter {
    private Console console;
    private Registry registry;
    private String command;
    private Command commands;


    public Command interpret(CommandLine commandLine) throws InvalidCommandException {
        console = new Console();
        registry = new Registry();

        command = commandLine.getCommand().toLowerCase();
        String[] commandList = {"add", "list", "delete", "help", "quit", "search"};

        switch (command) {
            case "add":
                return new AddContactCommand(console, registry, commandLine.getParameters());
            break;
            case "list":
                //return new ListCommand
        }
    }
}
