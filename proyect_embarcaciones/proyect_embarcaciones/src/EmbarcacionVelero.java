public class EmbarcacionVelero extends Embarcacion {


    //Attributes
    private Integer cantidadMastiles;

    //Constructor
    public EmbarcacionVelero(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan, Integer cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }


    //Methods
    @Override
    public Double calcularMontoAlquiler() {
        Double monto;
        if(super.getAnioFabricacion() > 2020) {
            return monto = super.getPrecioBase() + super.getValorAdicional();
        } else {
            return monto = super.getPrecioBase();
        }
    }


    public Boolean esGrande() {
        return this.cantidadMastiles > 4;
    }

}
