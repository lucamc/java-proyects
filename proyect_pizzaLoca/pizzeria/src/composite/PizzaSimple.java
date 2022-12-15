package composite;

public class PizzaSimple implements Pizza {

    //Atributos
    private String nombre, descripcion;
    private Double precioBase;
    private Boolean esEspecial;

    //Constructor
    public PizzaSimple(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Setters
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void setEsEspecial(Boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    //Métodos
    @Override
    public Double calcularPrecio() {
        if (this.esEspecial) {
            return (this.precioBase * 1.7);
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "PizzaSimple {" +
                "nombre='" + nombre + '\'' +
                ", precio='" + calcularPrecio() + '\'' +
                '}';
    }
}
