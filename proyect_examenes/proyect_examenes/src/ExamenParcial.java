public class ExamenParcial extends Examen {

    //Attributes
    private Integer nroUnidad, nroReintentos;

    //Constructor
    public ExamenParcial(String titulo, String enunciado, Integer nota, Alumno alumno, Integer nroUnidad, Integer nroReintentos) {
        super(titulo,enunciado,nota,alumno);
        this.nroUnidad = nroUnidad;
        this.nroReintentos = nroReintentos;
    }


    //Methods
    @Override
    public Boolean estaAprobado() {
        return super.getNota() >= 4;
    }


    public Boolean sePuedeRecuperar() {
        if (this.nroUnidad <= 3 && this.nroReintentos < 4) {
            this.nroReintentos ++;
            return true;
        } else {
            if (this.nroUnidad > 3 && this.nroReintentos < 3) {
                this.nroReintentos ++;
                return true;
            } else {
                return false;
            }
        }
    }
}
