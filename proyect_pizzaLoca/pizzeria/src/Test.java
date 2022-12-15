import clases.Pizzeria;
import composite.Pizza;
import composite.PizzaCombinada;
import composite.PizzaSimple;
import factory.PizzaFactory;

public class Test {
    public static void main(String[] args) {


        //Crear Pizzeria
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");


        //Crear Pizzas
        Pizza pizzaMuzzarella = PizzaFactory.getIsntance().crearPizza(PizzaFactory.CODIGO_PIZZA_SIMPLE, "Pizza Muzarrela", "Mucha Muzza");
        Pizza pizzaMargarita = PizzaFactory.getIsntance().crearPizza(PizzaFactory.CODIGO_PIZZA_SIMPLE, "Pizza Margarita", "Mucha Muzza");
        Pizza pizzaAnana = PizzaFactory.getIsntance().crearPizza(PizzaFactory.CODIGO_PIZZA_SIMPLE, "Pizza Anana", "Mucha Muzza");

        ((PizzaSimple) pizzaMuzzarella).setPrecioBase(700.0);
        ((PizzaSimple) pizzaMuzzarella).setEsEspecial(false);

        ((PizzaSimple) pizzaMargarita).setPrecioBase(850.0);
        ((PizzaSimple) pizzaMargarita).setEsEspecial(true);

        ((PizzaSimple) pizzaAnana).setPrecioBase(950.0);
        ((PizzaSimple) pizzaAnana).setEsEspecial(false);


        //Pizza Combinada
        Pizza combinadaLoca = PizzaFactory.getIsntance().crearPizza(PizzaFactory.CODIGO_PIZZA_COMBINADA, "Pizza Combinada", "Mucha Muzza");

        ((PizzaCombinada)combinadaLoca).agregarPizza(pizzaMargarita);
        ((PizzaCombinada)combinadaLoca).agregarPizza(pizzaAnana);

        pizzeria.agregarPizza(pizzaMargarita);
        pizzeria.agregarPizza(pizzaAnana);
        pizzeria.agregarPizza(pizzaMargarita);
        pizzeria.agregarPizza(combinadaLoca);

        System.out.println(pizzeria.mostrarPizzas());

    }
}