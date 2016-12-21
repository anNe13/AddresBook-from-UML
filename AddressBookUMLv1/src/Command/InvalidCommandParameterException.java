package Command;

public class InvalidCommandParameterException extends RuntimeException{

    public InvalidCommandParameterException(String massage){
        super(massage);
    }

}
