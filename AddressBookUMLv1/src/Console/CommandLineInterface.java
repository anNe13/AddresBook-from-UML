package Console;
import Command.Command;
public class CommandLineInterface implements InputHandler {

    private Console console;
    private CommandInterpreter commandInterpreter;

    @Override
    public void handle(CommandLine commandLine) {
        console = new Console();
        commandInterpreter = new CommandInterpreter();
        commandInterpreter.interpret(commandLine);
        console.registerInputHandler(this);

    }
}

