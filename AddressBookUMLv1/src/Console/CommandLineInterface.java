package Console;
import Command.Command;
public class CommandLineInterface implements InputHandler {

    @Override
    public void handle(CommandLine commandLine) {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        Command command = commandInterpreter.interpret(commandLine);
        Console consol = new Console();
        consol.registerInputHandler(this);
command.execute();
        //test
    }
}

