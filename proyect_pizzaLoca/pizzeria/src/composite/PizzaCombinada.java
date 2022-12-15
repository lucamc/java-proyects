package composite;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada implements Pizza{

    //Atributos
    private String nombre, descripcion;
    private List<Pizza> pizzas;

    //Constructor
    public PizzaCombinada(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pizzas = new ArrayList<>();
    }


    //Métodos
    @Override
    public Double calcularPrecio() {
        Double precioMasAlto = 0.0;
        for (Pizza pizza:pizzas) {
            if (pizza.calcularPrecio() > precioMasAlto) {
                precioMasAlto = pizza.calcularPrecio();
            }
        }
        return precioMasAlto;
    }


    public void agregarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }


    @Override
    public String toString() {
        return "PizzaCombinada {" +
                "nombre='" + nombre + '\'' +
                ", precio='" + calcularPrecio() + '\'' +
                '}';
    }
}
