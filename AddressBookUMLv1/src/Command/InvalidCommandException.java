package Command;

class InvalidCommandException extends RuntimeException {
    public InvalidCommandException (String message){
        super(message);
    }
}
