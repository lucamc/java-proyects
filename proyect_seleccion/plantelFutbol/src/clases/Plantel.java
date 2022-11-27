package clases;

import exception.PlantelException;

import java.util.ArrayList;
import java.util.List;

public class Plantel {

    //Attributes
    private String nombre;
    private List<Jugador> jugadorList;

    //Constructor
    public Plantel(String nombre) {
        this.nombre = nombre;
        this.jugadorList = new ArrayList<>();
    }



    //Methods
    public void addJugador(Jugador jugador) throws PlantelException {
        if (jugadorList.size() == 23) {
            throw new PlantelException("La lista debe contener solamente 23 jugadores");
        } else  {
            this.jugadorList.add(jugador);
        }
    }


    //Imprimir por consola la lista completa de jugadores
    public void printJugador() {
        for (Jugador jugador:jugadorList) {
            System.out.println(jugador.toString());
        }
    }





    //Obtener los últimos 5 jugadpres del plantel
    public List<Jugador> obtenerReserva() {

        List<Jugador> reserva = new ArrayList<>();
        for (int i = 18; i < this.jugadorList.size(); i++ ) {
            reserva.add(jugadorList.get(i));
        }
        return reserva;
    }

    public Integer cantJugadores(String posicion) throws PlantelException {

        //Lista de Posiciones para comparar con posicion por parametro
        List<String> posiciones = new ArrayList<>();
        posiciones.add("ARQUERO");
        posiciones.add("DEFENSOR");
        posiciones.add("MEDIOCAMPISTA");
        posiciones.add("DELANTERO");

        //inicializo contador
        int cantidad = 0;

        //Validacion de si List reserva contiene la posicion por parametro, de no contener arrojar exception
        if(!posiciones.contains(posicion)) {
            throw new PlantelException("La posicion solicitada no Existe");
        } else {
        //Recorro jugadorList contando jugadores de la posicion por parametro
            for (Jugador jugador:jugadorList) {
                if(jugador.getPosicion() == posicion) {
                    cantidad ++;
                }
            }
        }
        return cantidad;
    }
}
