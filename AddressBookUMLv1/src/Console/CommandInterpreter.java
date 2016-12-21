package Console;

import Command.Command;
import Command.InvalidCommandException;
import Command.InvalidCommandParameterException;
import Command.AddContactCommand;
import Registry.Registry;

import java.util.List;

public class CommandInterpreter {

    public Command interpret(CommandLine commandLine)throws InvalidCommandException {
        String command = commandLine.command.toLowerCase();
        String[] commandList = {"add", "list", "delete", "help", "quit", "search"};

        switch (command){
            case commandList[1]
        }
    }
}
