package exception;

public class EmpresaException extends Exception{

    //Constructor
    public EmpresaException(String message) {
        super(message);
    }


    //Method toString
    @Override
    public String toString() {
        return "Error, EmpresaException, Message: " + getMessage();
    }
}
