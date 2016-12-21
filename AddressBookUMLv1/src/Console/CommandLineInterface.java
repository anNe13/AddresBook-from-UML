package Console;

public class CommandLineInterface implements InputHandler {

    @Override
    public void handle(CommandLine commandLine) {
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        commandInterpreter.interpret(commandLine);
    }
}
