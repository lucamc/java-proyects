package clases;

public abstract class Empleado {

    //Attributes
    private String nombre, apellido;
    private Integer legajo;


    //Constructor
    public Empleado(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }


    //Method Abstract
    public abstract Double calcularSueldo(Integer dias);
}
