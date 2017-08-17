package exercise2;

import java.util.List;

public class CakeCover implements Composition {

	private String type;
	private List<Ingredient> ingredients;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	public boolean mixture(List<Ingredient> ingredientList) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean bake(List<Ingredient> ingredientList, Double time, Integer temperature) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean cook(List<Ingredient> ingredientList, Double time) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
