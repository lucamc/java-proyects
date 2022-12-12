import clases.Instituto;
import composite.Curso;
import composite.CursoIndividual;
import composite.ProgramaIntensivo;
import factory.CursoFactory;

public class Test {
    public static void main(String[] args) {

        //Crear Institución
        Instituto instituto = new Instituto("DigitalHouse");

        //Crear Cursos Individuales
        Curso frontend = CursoFactory.getInstance().crearCurso(CursoFactory.CODIGO_CURSO_INDIVIDUAL, "FrontEnd", "Curso FrontEnd");
        Curso backend = CursoFactory.getInstance().crearCurso(CursoFactory.CODIGO_CURSO_INDIVIDUAL, "BackEnd", "Curso BackEnd");

        //Crear Programa Intensivo
        Curso fullstack = CursoFactory.getInstance().crearCurso(CursoFactory.CODIGO_PROGRAMA_INTENSIVO, "FullStack", "Curso de FullStack");

        //Cargar los datos que me faltan para cada uno de los cursos y programas intensivos.
        //Para lograr acceder a los metodos correspondientes como los setters de la clase Curso Individual, tenemos que realizar un casteo
        ((CursoIndividual) frontend).setCargaHoraria(16.0);
        ((CursoIndividual) frontend).setCantidadMesesDuracion(2.0);
        ((CursoIndividual) frontend).setValorHora(1000.0);

        //Curso BackEnd
        ((CursoIndividual) backend).setCargaHoraria(20.0);
        ((CursoIndividual) backend).setCantidadMesesDuracion(2.0);
        ((CursoIndividual) backend).setValorHora(900.0);

        //FullStack
        ((ProgramaIntensivo) fullstack).agregarCurso(frontend);
        ((ProgramaIntensivo) fullstack).agregarCurso(backend);
        ((ProgramaIntensivo) fullstack).setBonificacion(20.0);

        //Cargar los cursos y programas intensivos al instituto.
        instituto.agregarCurso(frontend);
        instituto.agregarCurso(backend);
        instituto.agregarCurso(fullstack);


        //Mostrar el informe de los cursos mediante un foreach
        for (String curso:instituto.generarInforme()) {
            System.out.println(curso);
        }


    }
}