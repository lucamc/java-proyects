public class Alumno {

    //Attributes
    private String nombre, apellido, legajo;

    //Constructor
    public Alumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre  +
                ", Apellido: " + apellido  +
                ", Legajo: " + legajo ;
    }
}
