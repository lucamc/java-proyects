import java.time.LocalDate;

public class PropiedadCasa extends Propiedad implements Comparable{

    //Attributes
    private Integer cantAmbientes;
    private Double cantMetrosCuadrados;

    //Constructor
    public PropiedadCasa(LocalDate fechaAlquilada, Double precioUsd, String direccion, Boolean estaHipotecada, Duenio duenio, Integer cantAmbientes, Double cantMetrosCuadrados) {
        super(fechaAlquilada, precioUsd, direccion, estaHipotecada, duenio);
        this.cantAmbientes = cantAmbientes;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    //Methods
    @Override
    public Boolean sePuedeVender() {
        return !this.getEstaHipotecada();
    }

    //Interface Comparable
    public int compareTo(Object o) {
        PropiedadCasa propiedadParametro = (PropiedadCasa) o;

        if(this.cantAmbientes > propiedadParametro.cantAmbientes) {
            return 1;
        } else {
            if(this.cantAmbientes < propiedadParametro.cantAmbientes) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
