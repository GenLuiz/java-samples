package exercise2;

import java.util.List;

public interface Composition {

	public boolean mixture(List<Ingredient> ingredientList);
	
	public boolean bake(List<Ingredient> ingredientList, Double time, Integer temperature);
	
	public boolean cook(List<Ingredient> ingredientList, Double time);
}
