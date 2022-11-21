public class ExamenFinal extends Examen implements Comparable {

    //Attributes
    private Integer notaOral;
    private String descripcion;


    //Constructor
    public ExamenFinal(String titulo, String enunciado, Integer nota, Alumno alumno, Integer notaOral, String descripcion) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    //Methods
    @Override
    public Boolean estaAprobado() {
        return super.getNota() >= 4 && this.notaOral >= 4;
    }

    public Double calcularPromedio() {
        Double promedio = (super.getNota() + this.notaOral) / 2.0;
        return promedio;
    }

    //Interface Comparable
    @Override
    public int compareTo(Object o) {
        ExamenFinal examenParametro = (ExamenFinal) o;

        if(calcularPromedio() > examenParametro.calcularPromedio()) {
            return 1;
        } else {
            if (calcularPromedio() < examenParametro.calcularPromedio()) {
                return -1;
            } else {
                return 0;
            }
        }
    }


}
