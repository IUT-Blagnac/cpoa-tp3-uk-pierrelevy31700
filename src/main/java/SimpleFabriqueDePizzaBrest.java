import Pizzas.Pizza;
import Pizzas.PizzaFromageStyleBrest;
import Pizzas.PizzaGrecque;
import Pizzas.PizzaPoivrons;

public class SimpleFabriqueDePizzaBrest extends SimpleFabriqueDePizzas {

	public Pizza creerPizza(String type) {
		if (type.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			return new PizzaGrecque();
		} else {
			return new PizzaPoivrons();
		}
	}
	
}
