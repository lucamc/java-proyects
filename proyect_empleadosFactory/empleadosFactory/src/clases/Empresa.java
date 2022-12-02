package clases;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //Attributes
    private String razonSocial;
    private List<Empleado> empleadoList;


    //Constructor
    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleadoList = new ArrayList<>();
    }

    //Method
    public Double calcularSueldosTotal(Integer dias) {
        Double sueldoTotal = 0.0;
        for (Empleado empleado: empleadoList) {
           sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }


    public void agregarEmpleado(Empleado empleado) {
        this.empleadoList.add(empleado);
    }

}
