package exercise2;
import java.util.List;

public class Cake implements Composition {

	private String name;
	private List<Ingredient> ingredients;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return true;
	}
	
	public boolean cut(Cake cake){
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean cook(List<Ingredient> ingredientList, Double time) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
