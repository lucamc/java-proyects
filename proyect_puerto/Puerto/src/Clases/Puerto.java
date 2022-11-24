package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Puerto {

    //Attributes
    private String nombre;
    private List<Contenedor> listaContenedores;

    //Constructor
    public Puerto(String nombre) {
        this.nombre = nombre;
        this.listaContenedores = new ArrayList<>();
    }

    //Methods
    public void addContenedor(Contenedor contenedor) {
        listaContenedores.add(contenedor);
    }

    public List<Contenedor> mostrarContenedores() {
        List<Contenedor> contenedoresOrdenados = listaContenedores;
        contenedoresOrdenados.sort(null);
        return contenedoresOrdenados;
    }

    public Integer getCantContenedoresPeligrosos() {
        Integer cantidad = 0;
        for (Contenedor contenedor : listaContenedores) {
            if(contenedor.getTransportaMaterialPeligroso() && contenedor.getPaisProcedencia().equals("Desconocida") ){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
