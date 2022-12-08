import java.util.ArrayList;
import java.util.List;

public class Trencito {

    //Attributes
    private List<Figura> figurasList;


    //Constructor
    public Trencito() {
        this.figurasList = new ArrayList<>();
    }


    //Methods
    public void agregarFigura(Figura figura) {
        this.figurasList.add(figura);
    }


    public Double areaTrencito() {
        Double areaTrencito = 0.0;
        for (Figura figura : figurasList ) {
            areaTrencito += figura.area();
        }
        return areaTrencito;
    }

}
