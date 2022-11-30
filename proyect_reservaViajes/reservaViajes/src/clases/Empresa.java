package clases;

import exception.EmpresaException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    //Attributes
    private String nombre;
    private List<Rerserva> reservaList;


    //Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reservaList = new ArrayList<>();
    }



    //Methods
    public void addReserva(Rerserva rerserva) {
        this.reservaList.add(rerserva);
    }


    public Double recaudacionTotal() {
        Double recaudacionTotal = 0.0;
        //foreach para recorrer todas las reservas de mi list, acumular los preciosReserva
        for (Rerserva reserva:reservaList) {
            recaudacionTotal += reserva.getPrecioReserva();
        }
        return recaudacionTotal;
    }


    public Integer cantVecesRecorrida(String estacion) throws EmpresaException {

        List<String> estacionesDisponibles = new ArrayList<>();
        estacionesDisponibles.add("BUENOS AIRES");
        estacionesDisponibles.add("LUJAN");
        estacionesDisponibles.add("MERCEDES");
        estacionesDisponibles.add("SUIPACHA");
        estacionesDisponibles.add("CHIVILCOY");
        estacionesDisponibles.add("ALBERTI");
        estacionesDisponibles.add("BRAGADO");
        Integer cantidad = 0;
        return cantidad = contarVecesRecorrida(estacion);
    }


    public Integer contarVecesRecorrida(String estacion) {

        Integer cantidadPersonas = 0;
        if (!estacionesDisponibles.contains(estacion.toUpperCase())) {
            throw new EmpresaException("Estacion No Disponible - " + getClass().getName());
        } else {
            for (Rerserva rerserva:reservaList) {
                if(Objects.equals(rerserva.getRecorrido().getEstacionPartida(), estacion.toUpperCase()) ||
                        Objects.equals(rerserva.getRecorrido().getEstacionDestino(), estacion.toUpperCase())) {
                    cantidadPersonas += rerserva.getCantPersonas();
                }
            }
            return cantidadPersonas;
        }

    }
}
