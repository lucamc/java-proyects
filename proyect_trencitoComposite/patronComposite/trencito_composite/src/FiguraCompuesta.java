import java.security.PublicKey;
import java.util.List;

public class FiguraCompuesta implements Figura {


    //Attributes
    private String nombre;
    private List<Figura> figuras;



    //Constructor
    public FiguraCompuesta(String nombre, List<Figura> figuras) {
        this.nombre = nombre;
        this.figuras = figuras;
    }



    //Methods
    @Override
    public Double area() {
        Double areaTotal = 0.0;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
        }
        return areaTotal;
    }



    //toString
    @Override
    public String toString() {
        return "FiguraCompuesta{" +
                "nombre='" + nombre + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
