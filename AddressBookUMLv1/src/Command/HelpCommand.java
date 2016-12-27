package Command;

import Console.Console;
import java.util.List;

public class HelpCommand  implements Command{

    private HelpMeny helpMeny;
    private Console console;

    public HelpCommand() {
        console = new Console();
        console.print(format());
    }

    public String format() {
        helpMeny = new HelpMeny();

        List<Commands> tempList;
        String temp = "";
        tempList = helpMeny.getCommands();
        for (Commands c : tempList) {
            temp = tempList.toString().toLowerCase();
        }
        return temp;
    }

    @Override
    public void execute() throws InvalidCommandParameterException {
         new HelpCommand();
    }
}
