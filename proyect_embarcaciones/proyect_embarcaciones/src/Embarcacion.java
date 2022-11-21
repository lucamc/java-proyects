public abstract class Embarcacion {

    //Attributes
    private Double precioBase, valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;
    private Capitan capitan;


    //Constructor
    public Embarcacion(Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }


    //Getter
    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }


    //Method
    public abstract Double calcularMontoAlquiler();

}

