package exception;

public class PacienteException extends Exception{

    //Constructor
    public PacienteException(String message) {
        super(message);
    }

    //Method toString
    @Override
    public String toString() {
        return "Error PacienteException " + "Message: " + getMessage();
    }
}
