import clases.Empleado;
import clases.Empresa;
import factory.EmpleadoFactory;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("LC");

        //Llamo la clase factory
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        //Instanciar empleados y agregarlos a Empresa// por parametro se llama a la clase y atributo que contiene código
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_PH));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_PH));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_PH));


        //Calcular Sueldo total
        System.out.println("Sueldo Total: $" + empresa.calcularSueldosTotal(25));

    }
}