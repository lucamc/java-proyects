public class EmbarcacionYate extends Embarcacion implements Comparable{


    //Attributes
    private Integer cantidadCamarotes;

    //Constructor
    public EmbarcacionYate(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan, Integer cantidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    //Getter
    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    public Double calcularMontoAlquiler() {
        Double monto;
        if(super.getAnioFabricacion() > 2020) {
            return monto = super.getPrecioBase() + super.getValorAdicional();
        } else {
            return monto = super.getPrecioBase();
        }
    }

    @Override
    public int compareTo(Object o) {
        EmbarcacionYate embarcacionParametro = (EmbarcacionYate) o;

        if(this.cantidadCamarotes > embarcacionParametro.cantidadCamarotes) {
            return 1;
        } else {
            if(this.cantidadCamarotes < embarcacionParametro.cantidadCamarotes) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

