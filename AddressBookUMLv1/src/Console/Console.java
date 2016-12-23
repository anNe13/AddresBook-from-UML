package Console;

import Console.CommandLine;

import java.util.Scanner;

public class Console implements ConsolePrinter {

    @Override
    public void print(String string) {
        System.out.println(string);

    }
    public void registerInputHandler(InputHandler handler) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            CommandLine commandLine = new CommandLine();
            commandLine = commandLine.parse(scanner.nextLine());
            handler.handle(commandLine);

        }
    }



}
