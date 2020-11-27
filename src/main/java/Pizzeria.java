import Pizzas.Pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public final Pizza commanderPizza(String type) {

		Pizza pizza = this.creerPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();
		pizza.setName();
		
		return pizza;
	}
	
	protected abstract Pizza creerPizza(String type);
}