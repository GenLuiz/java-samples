package exercise2;

import java.util.List;

public class Cake {

	private List<Recipe> recipes;
	private String name;
	
	
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public boolean cut(CakeRecipe cake){
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean cool(Boolean baked, CakeRecipe cake) {
		// TODO Auto-generated method stub
		if(baked)
			return true;
		else
			return false;
	}
	public boolean fill(FillingRecipe recipeFilling) {
		// TODO Auto-generated method stub
		return true;
	}
	public Boolean group(CakeRecipe cakeRecipe) {
		// TODO Auto-generated method stub
		return true;
	}
	public Boolean cover(CakeCoverRecipe cakeCoverRecipe) {
		// TODO Auto-generated method stub
		return true;
	}
	public void isDone(String cakeName, Boolean cakeTogether, Boolean cakeFill, Boolean putCover) {
		// TODO Auto-generated method stub
		if(cakeTogether && cakeFill && putCover)
			System.out.println("The " + cakeName + " is done successfully");
	}
}
