import clases.Jugador;
import clases.Plantel;
import exception.PlantelException;

public class Main {
    public static void main(String[] args) {


        Plantel plantel = new Plantel("Uruguay");

        try {
            plantel.addJugador(new Jugador("Sergio", "Rochet", "ARQUERO",1));
            plantel.addJugador(new Jugador("Sergio", "Godin", "DEFENSA",2));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DEFENSA",3));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DEFENSA",4));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DEFENSA",5));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",6));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",7));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",8));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",9));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",10));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",11));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",12));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",13));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",14));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",15));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",16));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",17));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "MEDIOCAMPISTA",18));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",19));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",20));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",21));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",22));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",23));
            plantel.addJugador(new Jugador("Sergio", "Rochet", "DELANTERO",24));


        }catch (PlantelException e) {
            System.out.println(e.toString());
        }


        System.out.println(plantel.obtenerReserva());


        try {
            System.out.println("Cantidad Delanteros: "+ plantel.cantJugadores("DELANTERO"));
        } catch (PlantelException e) {
            System.out.println(e.toString());
        }

        plantel.printJugador();

    }
}