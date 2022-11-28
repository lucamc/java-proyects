import clases.Empresa;
import clases.Recorrido;
import clases.Rerserva;

public class Main {
    public static void main(String[] args) {


        try {

            //Crear Empresa
            Empresa empresa = new Empresa("TURVIAJES");

            //Crear Recorrido
            Recorrido bs_bra = new Recorrido("buenos aires", "bragado");
            Recorrido bra_bs = new Recorrido("bragado", "buenos aires");
            Recorrido bs_luj = new Recorrido("buenos aires", "lujan");
            Recorrido mer_bs = new Recorrido("mercedes", "buenos aires");

            System.out.println(bs_bra.toString());

            //Crear Reserva
            Rerserva reserva1 = new Rerserva("1",3,bs_bra);
            Rerserva reserva2 = new Rerserva("2",2,bs_bra);
            Rerserva reserva3 = new Rerserva("3",1,bra_bs);
            Rerserva reserva4 = new Rerserva("4",3,bs_luj);
            Rerserva reserva5 = new Rerserva("5",1,mer_bs);
            System.out.println(reserva1.toString());

            //Agregar reserva
            empresa.addReserva(reserva1);
            empresa.addReserva(reserva2);
            empresa.addReserva(reserva3);
            empresa.addReserva(reserva4);
            empresa.addReserva(reserva5);

            //Method Recaudacion Total
            System.out.println("Recaudacion total Rerservas: " + empresa.recaudacionTotal());

            //Method Cantidad veces recorrido
            System.out.println("Cantidad de Personas que Pasaron por la estación: " + empresa.cantVecesRecorrida("lujan"));



        } catch (Exception e) {
            System.out.println(e.toString());
        }




    }
}