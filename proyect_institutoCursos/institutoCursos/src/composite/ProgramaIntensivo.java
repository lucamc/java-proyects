package composite;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements Curso{

    //Atributos
    private String nombre, descripcion;
    private List<Curso> cursos;
    private Double bonificacion;


    //Constructor
    public ProgramaIntensivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }

    //Setters
    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    //Métodos
    @Override
    public Double calcularPrecio() {
        Double precioPrograma = 0.0;
        for (Curso curso:cursos) {
            precioPrograma += curso.calcularPrecio();
        }
        return (precioPrograma - ( precioPrograma * bonificacion / 100));
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }


    @Override
    public String toString() {
        return "ProgramaIntensivo {" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", bonificacion=" + bonificacion +
                ", precio=" + calcularPrecio() +
                ", cursos=" + cursos +
                '}';
    }
}
