package clases;

public class EmpleadoRelacionDependencia extends Empleado{

    //Attributes
    private Double sueldoMensual;


    //Constructor
    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo,
                                       Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }


    //Method
    @Override
    public Double calcularSueldo(Integer dias) {
       return ((sueldoMensual * dias) / 30);
    }
}
