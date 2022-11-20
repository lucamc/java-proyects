import java.time.LocalDate;

public class PropiedadCampo extends Propiedad {

    //Attributes
    private Boolean tieneCasco;
    private Integer cantHectareas;

    //Constructor
    public PropiedadCampo(LocalDate fechaAlquilada, Double precioUsd, String direccion, Boolean estaHipotecada, Duenio duenio, Boolean tieneCasco, Integer cantHectareas) {
        super(fechaAlquilada, precioUsd, direccion, estaHipotecada, duenio);
        this.tieneCasco = tieneCasco;
        this.cantHectareas = cantHectareas;
    }

    //Methods
    @Override
    public Boolean sePuedeVender() {
        if (super.getEstaHipotecada()) {
            return false;
        }
        return true;
    }

    public Boolean esAptoParaCultivo() {
        if (this.cantHectareas > 10) {
            return true;
        }
        return false;
    }
}
