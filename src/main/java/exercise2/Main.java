package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		
		final String TEACUP = "Tea Cup";
		
		//Measure used on composition for the cake
		Cup flourCup = new Cup();
		flourCup.setQuantity(2.0);
		flourCup.setType(TEACUP);
		
		Cup milkCup = new Cup();
		milkCup.setQuantity(1.0);
		milkCup.setType(TEACUP);
		
		Unit eggsQuantity = new Unit();
		eggsQuantity.setType("Eggs");
		eggsQuantity.setQuantity(5.0);
		
		Cup sugarCup = new Cup();
		sugarCup.setQuantity(1.0);
		sugarCup.setType(TEACUP);
		
		Spoon bakingPowderSpoon = new Spoon();
		bakingPowderSpoon.setQuantity(1.0);
		bakingPowderSpoon.setType("Teaspoon");
		
		Cup chocolateCup = new Cup();
		chocolateCup.setQuantity(1.0);
		chocolateCup.setType(TEACUP);
		
		//ingredients composition for the cake
		Ingredient wheat = new Ingredient();
		wheat.setName("Wheat");
		wheat.setMeasure(flourCup);
		
		Ingredient milk = new Ingredient();
		milk.setName("Milk");
		milk.setMeasure(milkCup);
		
		Ingredient eggs = new Ingredient();
		eggs.setName("Eggs");
		eggs.setMeasure(eggsQuantity);
		
		Ingredient sugar = new Ingredient();
		sugar.setName("Sugar");
		sugar.setMeasure(sugarCup);
		
		Ingredient bakingPowder = new Ingredient();
		bakingPowder.setName("Baking Powder");
		bakingPowder.setMeasure(bakingPowderSpoon);
		
		Ingredient chocolatePowder = new Ingredient();
		chocolatePowder.setName("Chocolate Powder");
		chocolatePowder.setMeasure(chocolateCup);
		
		List<Ingredient> cakeRecipe = new ArrayList<Ingredient>();
		
		cakeRecipe.add(wheat);
		cakeRecipe.add(milk);
		cakeRecipe.add(eggs);
		cakeRecipe.add(sugar);
		cakeRecipe.add(bakingPowder);
		cakeRecipe.add(chocolatePowder);
		
		Cake brigadeirosCake = new Cake();
		brigadeirosCake.setIngredients(cakeRecipe);
		brigadeirosCake.setName("Brigadeiro's Cake");
		
		Boolean baked = brigadeirosCake.bake(cakeRecipe, 35.00, 350);
		
		if(baked){
			//TODO: 
		}
		
		
	}

}
