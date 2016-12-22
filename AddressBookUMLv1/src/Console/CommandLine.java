package Console;

import java.util.ArrayList;
import java.util.List;

public class CommandLine {


    private String command;
    private List<String> parameters=new ArrayList<String>(); {
    };

    public String getCommand() {
        return command;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public CommandLine parse(String text) { //Nikolaj påpekar outofband exception
        String[] temp = text.split(" ");





        command = temp[0];
        for (int i = 1; i < temp.length; i++){

            System.out.println(parameters);
            parameters.add(temp[i]);


        }
        return this;
    }
}