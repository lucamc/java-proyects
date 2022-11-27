package exception;

public class PlantelException extends Exception{

    //constructor de Plantelexception
    public PlantelException(String message) {
        super(message);
    }

    //toString de la excepcion
    @Override
    public String toString() {
        return "Error PlantelException  Message: " + this.getMessage();
    }
}
