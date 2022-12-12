package composite;

public class CursoIndividual implements Curso {

    //Atributos
    private String nombre,  descripcion;
    private Double cargaHoraria, cantidadMesesDuracion, valorHora;


    //Constructor
    public CursoIndividual(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Setters
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setCantidadMesesDuracion(Double cantidadMesesDuracion) {
        this.cantidadMesesDuracion = cantidadMesesDuracion;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }


    //Métodos
    @Override
    public Double calcularPrecio() {
        return ((cargaHoraria * cantidadMesesDuracion) * valorHora) ;
    }

    @Override
    public String toString() {
        return "CursoIndividual {" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + calcularPrecio() +
                '}';
    }
}
