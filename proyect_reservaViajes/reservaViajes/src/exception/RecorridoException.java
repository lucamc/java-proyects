package exception;

public class RecorridoException extends Exception{

    //Constructor
    public RecorridoException(String message) {
        super(message);
    }


    //method toString
    @Override
    public String toString() {
        return "Error RecorridoException, Message " + getMessage();
    }
}
