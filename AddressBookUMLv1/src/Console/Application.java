package Console;

public class Application {
    void start(){
        CommandLine cl = new CommandLine();


        CommandLineInterface cli = new CommandLineInterface();
        cli.handle(cl);
    }
    void quit(){
        System.exit(0);
    }
}
