package Console;

import Command.Command;
import Command.InvalidCommandException;
import Command.InvalidCommandParameterException;

public class CommandInterpreter {

    public Command interpret(CommandLine commandLine)throws InvalidCommandException {
        final String command = commandLine.command.toLowerCase();
        if (command.equals("add") || command.equals("list")
                || command.equals("delete") || command.equals("help") || command.equals("quit")
                || command.equals("search")){
            return null;
    }
        else {
            throw new InvalidCommandException("Fel kommando...");
        }

    }
}
