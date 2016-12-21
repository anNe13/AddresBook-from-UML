package Console;

public class Application {
    private CommandLine commandLine;
    private CommandLineInterface commandLineInterface;
    void start(){
        commandLine = new CommandLine();
        commandLineInterface = new CommandLineInterface();

        commandLineInterface.handle(commandLine);
    }
    void quit(){
        System.exit(0);
    }
}
