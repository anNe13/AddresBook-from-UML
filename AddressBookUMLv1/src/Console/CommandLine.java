package Console;

import java.util.List;

public class CommandLine {

    protected String command;
    protected List<String> parameters;

    public CommandLine parse(String text) { //Nikolaj påpekar outofband exception
        String[] temp = text.split(" ");
        command = temp[0];
        for (int i = 1; i < temp.length; i++){
            parameters.add(temp[i]);
        }
        return this;
    }
}