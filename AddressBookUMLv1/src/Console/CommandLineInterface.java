package Console;
import Command.Command;
public class CommandLineInterface implements InputHandler {

    @Override
    public void handle(CommandLine commandLine) {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        Command command = commandInterpreter.interpret(commandLine);
command.
    }
}

