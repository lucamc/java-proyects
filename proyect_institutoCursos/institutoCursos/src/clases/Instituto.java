package clases;

import composite.Curso;

import java.util.ArrayList;
import java.util.List;


/**
 * La clase `Instituto` representa a un instituto que ofrece cursos, con su nombre y una lista de cursos disponibles en su oferta academica.
 *
 * @author Lucas Custodio
 */
public class Instituto {

    //Atributos
    private String nombre;
    private List<Curso> listCursos;


    /**
      Crea un nuevo Instituto con el nombre especificado
      @param nombre Es el nombre del instituto.
     */
    public Instituto(String nombre) {
        this.nombre = nombre;
        this.listCursos = new ArrayList<>();
    }


    /**
     * Agrega un nuevo curso a la lista de cursos del instituto.
     * @param curso Es el curso a agregar.
     */
    public void agregarCurso(Curso curso) {
        this.listCursos.add(curso);
    }


    public List<String> generarInforme() {
        List<String> informeCursos = new ArrayList<>();
        for (Curso curso:listCursos) {
            informeCursos.add(curso.toString());
        }
        return  informeCursos;
    }

}
