public abstract class Examen {

    //Attributes
    private String titulo, enunciado;
    private Integer nota;
    private Alumno alumno;


    //Constructor
    public Examen(String titulo, String enunciado, Integer nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }


    //Getters
    public Integer getNota() {
        return nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    //Method
    public abstract Boolean estaAprobado();
}
