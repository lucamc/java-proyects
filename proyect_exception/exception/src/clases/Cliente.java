package clases;

import exception.ClienteException;

public class Cliente {

    //Attributes
    private String nombre, apellido, dni;
    private Double deuda, limite;

    //Constructor
    public Cliente(String nombre, String apellido, String dni, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        this.deuda = 0.0;
    }


    //Methods
    public void comprar(Double importe) throws ClienteException {
        Double valorTotal = this.deuda + importe;
        if(valorTotal > limite) {
            throw new ClienteException("Importe de compra supera limite disponible - " + getClass().getName());
        }
        this.deuda = valorTotal;
    }

    public void saldarDeuda(Double importe) throws ClienteException {
        if(importe > this.deuda) {
            throw new ClienteException("Importe mayor a deuda pendiente - " + getClass().getName());
        }
        this.deuda -= importe;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", deuda=" + deuda +
                ", limite=" + limite +
                '}';
    }
}











