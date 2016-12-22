package Console;

import Console.CommandLine;

import java.util.Scanner;

public class Console implements ConsolePrinter {
    private CommandLine commandLine;
    private Scanner scanner;


    @Override
    public void print(String string) {
        System.out.println(string);

    }

    public void registerInputHandler(InputHandler handler) {
        handler.handle(userInput());


    }

    public CommandLine userInput() {
        commandLine = new CommandLine();
        scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            commandLine = commandLine.parse(scanner.nextLine());
        }
        return commandLine;
    }


}
