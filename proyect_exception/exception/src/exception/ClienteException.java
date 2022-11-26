package exception;

public class ClienteException extends Exception{

    //Constructor
    public ClienteException(String message) {
        super(message);
    }


    //Method toString
    @Override
    public String toString() {
        return "Error CLienteException: " + "Mensaje: " + this.getMessage();
    }
}
