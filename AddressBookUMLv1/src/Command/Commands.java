package Command;

public enum Commands {

    LIST("Type: list to see all contats"),
    ADD("Type: add followed by first name and second name"),
    QUIT("Type: quit to exit application"),
    DELETE("Type delete followed by"),
    SEARCH("Type search followed by the first letter/letters in first or second name"),
    HELP("Type help to see all valid commands");

    public final String commandInfo;

    Commands(String cInfo){
        commandInfo = cInfo;
    }

    public String getCommandInfo(){
        return commandInfo;
    }
}
