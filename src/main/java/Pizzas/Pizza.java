package Pizzas;
import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	protected String name;
	private String crust;
	private String sauce;
	private ArrayList garnitures;
	
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

	public void bake() {
		// TODO Auto-generated method stub
		
	}

	public void cut() {
		// TODO Auto-generated method stub
		
	}

	public void wrap() {
		// TODO Auto-generated method stub
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName() {
		this.name="Pizza";
		
	}

}
