import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        //Creacion de productos Individuales
        Producto hamburguesa = new ProductoIndividual("Big Mac", 350.0);
        Producto papasChicas = new ProductoIndividual("Papas Chicas", 175.0);
        Producto papasGrandes = new ProductoIndividual("Papas Grandes", 200.0);
        Producto gaseosa = new ProductoIndividual("Gaseosa", 75.0);

        //Creacion de Combo
        List<Producto> productosDelCombo = new ArrayList<>();
        productosDelCombo.add(hamburguesa);
        productosDelCombo.add(papasGrandes);
        productosDelCombo.add(gaseosa);

        Producto comboBig = new ProductoCombo("Combo Big Mac", 15.0, productosDelCombo);

        carrito.agregarProducto(comboBig);
        carrito.agregarProducto(papasGrandes);
        carrito.agregarProducto(gaseosa);

        System.out.println("Total a Pagar $" + carrito.precioTotal());

    }
}