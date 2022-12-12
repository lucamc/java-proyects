package factory;

import composite.Curso;
import composite.CursoIndividual;
import composite.ProgramaIntensivo;

public class CursoFactory  {

    //Atributo
    private static CursoFactory instance;
    public static final String CODIGO_CURSO_INDIVIDUAL = "CursoIndividual";
    public static final String CODIGO_PROGRAMA_INTENSIVO = "ProgramaIntensivo";


    //Constructor
    private CursoFactory() {

    }

    //Método Singleton
    public static CursoFactory getInstance() {
        if (instance == null) {
            instance = new CursoFactory();
        }
        return instance;
    }

    //Método Factory
    public Curso crearCurso(String codigo, String nombre, String descripcion) {
        switch (codigo) {
            case CODIGO_CURSO_INDIVIDUAL:
                return new CursoIndividual(nombre, descripcion);
            case CODIGO_PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo(nombre, descripcion);
        }
        return null;
    }
}
