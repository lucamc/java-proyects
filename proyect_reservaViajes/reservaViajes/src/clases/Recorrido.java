package clases;
import exception.RecorridoException;
import java.util.ArrayList;
import java.util.List;

public class Recorrido {

    //Attributes
    private String estacionPartida, estacionDestino;




    //Constructor
    public Recorrido(String estacionPartida, String estacionDestino) throws RuntimeException, RecorridoException {

        //Valido que estaciones por parametro se encuentren en las estacciones disponibles, sino arrojo exception
        List<String> estacionesDisponibles = new ArrayList<>();
        estacionesDisponibles.add("BUENOS AIRES");
        estacionesDisponibles.add("LUJAN");
        estacionesDisponibles.add("MERCEDES");
        estacionesDisponibles.add("SUIPACHA");
        estacionesDisponibles.add("CHIVILCOY");
        estacionesDisponibles.add("ALBERTI");
        estacionesDisponibles.add("BRAGADO");

        if (!estacionesDisponibles.contains(estacionPartida.toUpperCase()))  {
            throw new RecorridoException("La estación de Partida No esta Disponible - " + getClass().getName());

        } else if(!estacionesDisponibles.contains(estacionDestino.toUpperCase())) {
            throw new RecorridoException("La estación de Destino No esta Disponible - " + getClass().getName());

            //Validar que las estaciones no sean Iguales
        } else if(estacionPartida.toUpperCase().equals(estacionDestino.toUpperCase())) {
            throw new RecorridoException("Las estaciónes NO pueden ser iguales - " + getClass().getName());

        } else {
            this.estacionPartida = estacionPartida.toUpperCase();
            this.estacionDestino = estacionDestino.toUpperCase();
        }
    }

    //Getters
    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    //Method toString
    @Override
    public String toString() {
        return "Recorrido: " +
                "Estacion Partida: '" + estacionPartida + '\'' +
                ", Estacion Destino: '" + estacionDestino + '\'';
    }

}
