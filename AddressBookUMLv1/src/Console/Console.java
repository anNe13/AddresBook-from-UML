package Console;

import Console.CommandLine;
import java.util.Scanner;

public class Console implements ConsolePrinter {

    @Override
    public void print(String string) {
        System.out.println(string);

    }

    public void registerInputHandler(InputHandler handler) {
        InputHandler handler1 = new CommandLineInterface();

        Scanner scanner = new Scanner(System.in);
        CommandLine cl = new CommandLine();

        while (scanner.hasNextLine()){
            cl = cl.parse(scanner.nextLine());

        }

    }

}
