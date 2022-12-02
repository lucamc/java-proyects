package clases;

public class EmpleadoContratado extends Empleado{

    //Attributes
    private Double importePorHora;
    private Double retencionImpuesto;


    //Constructor
    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }


    //Method
    @Override
    public Double calcularSueldo(Integer dias) {
        double sueldoTotal = ((importePorHora * 8) * dias);
        return sueldoTotal - (sueldoTotal * retencionImpuesto / 100);
    }
}
