package factory;

import composite.Pizza;
import composite.PizzaCombinada;
import composite.PizzaSimple;

public class PizzaFactory {

    //Attributes
    private static PizzaFactory instance;
    public static final String CODIGO_PIZZA_SIMPLE = "PizzaSimple";
    public static final String CODIGO_PIZZA_COMBINADA = "PizzaCombinada";


    //Constructor
    PizzaFactory() {

    };

    //Singleton
    public static PizzaFactory getIsntance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    //Método Factory
    public Pizza crearPizza(String codigo, String nombre, String descripcion) {
        switch (codigo) {
            case CODIGO_PIZZA_SIMPLE:
                return new PizzaSimple(nombre, descripcion);
            case CODIGO_PIZZA_COMBINADA:
                return new PizzaCombinada(nombre, descripcion);
        }
        return null;
    }
}
