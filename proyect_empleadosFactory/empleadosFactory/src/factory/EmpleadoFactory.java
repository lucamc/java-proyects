package factory;
import clases.Empleado;
import clases.EmpleadoContratado;
import clases.EmpleadoRelacionDependencia;

public class EmpleadoFactory {

    //Atributo publico static de tipo EmpleadoFactory
    private static EmpleadoFactory instance;

    public static final String CODIGO_EMPLEADO_RD = "EMP-RD";
    public static final String CODIGO_EMPLEADO_PH = "EMP-PH";

    //Constructor privado/vacio
    public EmpleadoFactory(){};

    //MethodoSingleton Inicializacion tardia.
    public static EmpleadoFactory getInstance() {
        //Valido que solamente exista una instancia de la clase
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }


    //Method Factory, patron de creación
    public Empleado generarEmpleado(String codigo) {
        switch (codigo) {
            case "EMP-RD":
                return new EmpleadoRelacionDependencia(null, null, null, 1000.0);
            case "EMP-PH":
                return new EmpleadoContratado(null,null,null,7.0,14.0);
            default:
                System.out.println("Código no valido");
                return null;
        }
    }
}
