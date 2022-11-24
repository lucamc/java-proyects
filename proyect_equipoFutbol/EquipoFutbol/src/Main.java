import clases.Equipo;
import clases.Jugador;

public class Main {
    public static void main(String[] args) {

        //Jugadores
        Jugador jugador1 = new Jugador(5,"Lucas",false,true);
        Jugador jugador2 = new Jugador(15,"Martin",true,true);
        Jugador jugador3 = new Jugador(20,"Jose",true,true);
        Jugador jugador4 = new Jugador(10,"Custodio",false,false);
        Jugador jugador5 = new Jugador(13,"Costa",false,false);
        Jugador jugador6 = new Jugador(1,"Fred",false,true);

        //Equipo
        Equipo equipo = new Equipo("uruguay");

        equipo.addJugador(jugador1);
        equipo.addJugador(jugador2);
        equipo.addJugador(jugador3);
        equipo.addJugador(jugador4);
        equipo.addJugador(jugador5);
        equipo.addJugador(jugador6);

        System.out.println("Titulares: " + equipo.mostrarJugadoresTitulares());
        System.out.println("Cantidad de Lesionados: " + equipo.getCantJugadoresLesionados());


    }
}