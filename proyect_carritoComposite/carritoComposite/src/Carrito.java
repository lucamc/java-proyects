import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productosList;

    public Carrito() {
        this.productosList = new ArrayList<>();
    }


    //Method
    public void agregarProducto(Producto producto) {
        this.productosList.add(producto);
    }



    public Double precioTotal() {
        Double precioTotal = 0.0;
        for (Producto producto:productosList) {
            precioTotal += producto.costo();
        }
        return precioTotal;
    }

}
