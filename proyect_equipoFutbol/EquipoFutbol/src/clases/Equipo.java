package clases;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    //Attributes
    private String nombre;
    private List<Jugador> listaJugadores;

    //Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<Jugador>();
    }

    //Methods
    public void addJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }

    public List<Jugador> mostrarJugadoresTitulares() {
        listaJugadores.sort(null); //Method sort(), al colocar null utilo el compareTo() de clase Jugador
        List<Jugador> jugadoresTitulares = new ArrayList<>();

        for (Jugador jugador: listaJugadores) {
            if (jugador.getTitular()) {
                jugadoresTitulares.add(jugador);
            }
        }
        return jugadoresTitulares;
    }

    public Integer getCantJugadoresLesionados() {
        Integer cantidadLesionados = 0;
        for (Jugador jugador: listaJugadores) {
            if (jugador.getLesionado() && jugador.getTitular()) {
                cantidadLesionados ++;
            }
        }
        return cantidadLesionados;
    }


}
