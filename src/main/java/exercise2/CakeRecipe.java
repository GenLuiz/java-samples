package exercise2;
import java.util.List;

public class CakeRecipe extends Recipe implements Composition {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean mixture(List<Ingredient> ingredientList) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean bake(List<Ingredient> ingredientList, Double time, Integer temperature) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean cook(List<Ingredient> ingredientList, Double time) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
