package clases;

import exception.PacienteException;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {

    //Attributes
    private String nombre, apellido, dni;
    private LocalDate fechaInternacion, fechaAlta;


    //Constructor
    public Paciente(String nombre, String apellido, String dni,
                    LocalDate fechaInternacion) throws PacienteException {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaInternacion = validarFechaInternacion(fechaInternacion); //Validar Fecha
    }

    
    //Method Validar fecha de Internación
    public LocalDate validarFechaInternacion (LocalDate fechaInternacion) throws PacienteException {
        if (fechaInternacion.isAfter(LocalDate.now())) {
            throw new PacienteException("Fecha de Internación es posterior a la fecha Actual - " + getClass().getName());
        }
        return fechaInternacion;
    }


    public void darAlta(LocalDate fechaAlta) throws PacienteException {

        //Validar si fecha de Alta es Anterior a Fecha de Internación
        if(fechaAlta.isBefore(this.fechaInternacion)) {
            throw new PacienteException("Fecha de alta es Anterior a la Fecha de Internación - " + getClass().getName());
        }
        this.fechaAlta = fechaAlta;
    }

    //Method toString
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaInternacion=" + fechaInternacion +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
