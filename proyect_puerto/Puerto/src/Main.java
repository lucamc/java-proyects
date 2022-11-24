import Clases.Contenedor;
import Clases.Puerto;

public class Main {
    public static void main(String[] args) {

        Puerto puerto = new Puerto("Puerto Montevideo");

        Contenedor contenedor1 = new Contenedor(1,"China", true);
        Contenedor contenedor2 = new Contenedor(2,"EE.UU", false);
        Contenedor contenedor3 = new Contenedor(7,"Desconocida", true);
        Contenedor contenedor4 = new Contenedor(5,"China", true);
        Contenedor contenedor5 = new Contenedor(4,"Desconocida", false);

        puerto.addContenedor(contenedor1);
        puerto.addContenedor(contenedor2);
        puerto.addContenedor(contenedor3);
        puerto.addContenedor(contenedor4);
        puerto.addContenedor(contenedor5);

        System.out.println("Contenedores: " + puerto.mostrarContenedores());
        System.out.println("Cantidad Contenedores Peligrosos: " + puerto.getCantContenedoresPeligrosos());
    }
}