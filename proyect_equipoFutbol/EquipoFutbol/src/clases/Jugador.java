package clases;

public class Jugador implements Comparable<Jugador>{

    //Attributes
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado, titular;

    //Constructor
    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    //Getter
    public Boolean getTitular() {
        return titular;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    //Interface, Comparable
    @Override
    public int compareTo(Jugador jugador) {
        return this.nroCamiseta.compareTo(jugador.nroCamiseta);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", lesionado=" + lesionado +
                ", titular=" + titular +
                '}';
    }
}
