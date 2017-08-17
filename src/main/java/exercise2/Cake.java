package exercise2;
import java.util.HashSet;
import java.util.Set;

public class Cake {

	private String type;
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
}
