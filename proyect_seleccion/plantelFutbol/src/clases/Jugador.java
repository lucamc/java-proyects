package clases;

public class Jugador {

    //Attributes
    private String nombre, apellido, posicion;
    private Integer nroCamiseta;


    //Constructor
    public Jugador(String nombre, String apellido, String posicion, Integer nroCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
    }

    //Getter
    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                '}';
    }
}

