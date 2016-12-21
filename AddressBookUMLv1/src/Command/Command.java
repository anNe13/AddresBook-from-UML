package Command;

public interface Command {

    void getName();
    void getDescription();
    void execute()throws InvalidCommandParameterException;

}
