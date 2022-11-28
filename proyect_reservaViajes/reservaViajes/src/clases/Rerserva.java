package clases;

import java.util.Date;
import java.util.Objects;

public class Rerserva {

    //Attributes
    private String codigo;
    private Integer cantPersonas;
    private Recorrido recorrido;
    private Double precioReserva;


    //Constructor
    public Rerserva(String codigo, Integer cantPersonas, Recorrido recorrido) {

        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.recorrido = recorrido;

        //Precio Boleto, Descuento
        double precioBoleto = 50.0;
        double descuentoOfrecido = 0.2;

        //Validacion si se realiza Descuento en el precio de la Rerserva
        if(Objects.equals(this.recorrido.getEstacionPartida(), "BUENOS AIRES") && Objects.equals(this.recorrido.getEstacionDestino(), "BRAGADO") ||
                Objects.equals(this.recorrido.getEstacionPartida(), "BRAGADO") && Objects.equals(this.recorrido.getEstacionDestino(), "BUENOS AIRES")) {


            double descuentoRealizado = ((cantPersonas * precioBoleto) * descuentoOfrecido);
            this.precioReserva = ((cantPersonas * precioBoleto) - descuentoRealizado);

        } else {
            this.precioReserva = (cantPersonas * precioBoleto);
        }
    }


    //Getter
    public Double getPrecioReserva() {
        return precioReserva;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    //Method toString
    @Override
    public String toString() {
        return "Rerserva {" +
                "Codigo:'" + codigo + '\'' +
                ", CantPersonas: " + cantPersonas +
                ", Recorrido: " + recorrido +
                ", PrecioReserva: " + precioReserva +
                '}';
    }
}
