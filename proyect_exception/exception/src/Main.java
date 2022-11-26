import clases.Cliente;
import exception.ClienteException;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("Lucas","Custodio","12345",1000.0);

        try {
            cliente.comprar(600.0);
        }catch (ClienteException e) {
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());

        try {
            cliente.comprar(600.0);
        } catch (ClienteException e) {
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());

        try {
            cliente.saldarDeuda(500.0);
        } catch (ClienteException e) {
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());

        try {
            cliente.saldarDeuda(200.0);
        }catch (ClienteException e) {
            System.out.println(e.toString());
        }

        System.out.println(cliente.toString());

    }
}