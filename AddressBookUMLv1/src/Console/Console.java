package Console;


public class Console implements ConsolePrinter {

    @Override
    public void print(String string) {
        System.out.println(string);

    }

    public void registerInputHandler(InputHandler hadler) {
        InputHandler handler = new CommandLineInterface();
    }
}
