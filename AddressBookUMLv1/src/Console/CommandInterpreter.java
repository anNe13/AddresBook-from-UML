package Console;
import Command.*;
import Command.Command;
import Registry.Registry;
import RemoteReg.RemoteRegistry;

public class CommandInterpreter {
    private Console console;
    private Registry registry;
    private String command;
    //private Command commands;
    private RemoteRegistry remoteRegistry;


    public Command interpret(CommandLine commandLine) throws InvalidCommandException {
        console = new Console();
        registry = new Registry();
        remoteRegistry = new RemoteRegistry();

        command = commandLine.getCommand().toLowerCase();
        String[] commandList = {"add", "list", "delete", "help", "quit", "search"};

        switch (command) {
            case "add":
                return new AddContactCommand(console, registry, commandLine.getParameters());
            case "list":
                ListCommand listCommand = new ListCommand(console,registry,remoteRegistry);
                listCommand.execute();
                return listCommand;
            case "delete":
                return new DeleteContactCommand(console, registry, commandLine.getParameters());
            case "search":
                //return new SearchCommand();
                break;
            case "help":
                //return new HelpCommand();
            case "quit":
                console.print("Stänger av programmet...");
                System.exit(0);
                break;

        }
        return null;
    }
}
