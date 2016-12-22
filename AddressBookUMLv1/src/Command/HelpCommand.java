package Command;

public class HelpCommand {

    private HelpMeny helpMeny;
    private Commands commands;

    public String format(Commands commands){
        helpMeny = new HelpMeny();
        helpMeny.getCommands().toString().toLowerCase();
        return "";
    }

}
