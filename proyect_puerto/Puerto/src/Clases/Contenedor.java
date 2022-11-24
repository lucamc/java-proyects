package Clases;

public class Contenedor implements Comparable<Contenedor>{

    //Attributes
    private Integer nroIdentificador;
    private String paisProcedencia;
    private Boolean transportaMaterialPeligroso;

    //Constructor
    public Contenedor(Integer nroIdentificador, String paisProcedencia, Boolean transportaMaterialPeligroso) {
        this.nroIdentificador = nroIdentificador;
        this.paisProcedencia = paisProcedencia;
        this.transportaMaterialPeligroso = transportaMaterialPeligroso;
    }

    //Getters
    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Boolean getTransportaMaterialPeligroso() {
        return transportaMaterialPeligroso;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        return this.nroIdentificador.compareTo(contenedor.nroIdentificador);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "nroIdentificador=" + nroIdentificador +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", transportaMaterialPeligroso=" + transportaMaterialPeligroso +
                '}';
    }
}
