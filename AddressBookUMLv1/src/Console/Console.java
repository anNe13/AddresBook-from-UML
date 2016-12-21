package Console;

import Console.CommandLine;
import java.util.Scanner;

public class Console implements ConsolePrinter {


    @Override
    public void print(String string) {
        System.out.println(string);

    }

    public void registerInputHandler(InputHandler handler) {
        handler.handle(userInput());


    }

        public CommandLine userInput() {
            CommandLine cl = new CommandLine();
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                cl = cl.parse(scanner.nextLine());
            }
            return cl;
        }



}
