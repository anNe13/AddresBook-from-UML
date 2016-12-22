package Command;

import java.util.ArrayList;
import java.util.List;

public class HelpCommand {

    private HelpMeny helpMeny;
    private Commands commands;

    public String format(){
        helpMeny = new HelpMeny();

        List<Commands> tempList;
        String temp = "";

        tempList = helpMeny.getCommands();
        for (Commands commands: tempList ){
            temp = tempList.toString().toLowerCase();
        }
        return temp;
    }

}
