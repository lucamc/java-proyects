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
        this.fechaAlta = null;

        //Validar si fecha internación es posterior a la fecha actual
        LocalDate date = LocalDate.now();
        if (fechaInternacion.isAfter(date)) {
            throw new PacienteException("Fecha de Internación es posterior a la fecha Actual - " + getClass().getName());
        } else {
            this.fechaInternacion = fechaInternacion;
        }

    }

    //Method
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
