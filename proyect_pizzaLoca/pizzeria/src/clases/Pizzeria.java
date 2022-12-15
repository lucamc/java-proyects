package clases;

import composite.Pizza;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    //Atributos
    private String nombre;
    private List<Pizza> pizzas;

    //Constructor
    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas = new ArrayList<>();
    }

    //Métodos
    public void agregarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }


    public List<String> mostrarPizzas() {
        List<String> listaPizzas = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            listaPizzas.add(pizza.toString());
        }
        return listaPizzas;
    }
}
