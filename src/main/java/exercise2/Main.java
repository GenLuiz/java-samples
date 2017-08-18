package exercise2;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		

		//Measure used on composition for the cake
		Cup flourCup = new Cup();
		flourCup.setQuantity(2.0);
		flourCup.setType(Types.TEACUP);
		
		Cup milkCup = new Cup();
		milkCup.setQuantity(1.0);
		milkCup.setType(Types.TEACUP);
		
		Unit eggsQuantity = new Unit();
		eggsQuantity.setType(Types.EGGS);
		eggsQuantity.setQuantity(5.0);
		
		Cup sugarCup = new Cup();
		sugarCup.setQuantity(1.0);
		sugarCup.setType(Types.TEACUP);
		
		Spoon bakingPowderSpoon = new Spoon();
		bakingPowderSpoon.setQuantity(1.0);
		bakingPowderSpoon.setType(Types.SOUPSPOON);
		
		Cup chocolateCup = new Cup();
		chocolateCup.setQuantity(1.0);
		chocolateCup.setType(Types.TEACUP);
		//end Measure used on composition for the cake
		
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
		// end ingredients composition for the cake
		
		//list ingredient
		List<Ingredient> recipeCakeList = new ArrayList<Ingredient>();
		
		recipeCakeList.add(wheat);
		recipeCakeList.add(milk);
		recipeCakeList.add(eggs);
		recipeCakeList.add(sugar);
		recipeCakeList.add(bakingPowder);
		recipeCakeList.add(chocolatePowder);
		//end list ingredient
		
		CakeRecipe cakeRecipe = new CakeRecipe();
		cakeRecipe.setName("Brigadeiro's cake");
		cakeRecipe.setIngredients(recipeCakeList);
		
		Boolean cakeMixture = false; 
		Boolean cakeBake = false;
		
		cakeMixture = cakeRecipe.mixture(recipeCakeList);
		if(cakeMixture)
			cakeBake = cakeRecipe.bake(recipeCakeList, 35.00, 350);
		
		// making the filling
		
		//measures for the filling
		Cup chocolateFillingCup = new Cup();
		chocolateFillingCup.setQuantity(0.5);
		chocolateFillingCup.setType(Types.TEACUP);
		
		Spoon butterSpoon = new Spoon();
		butterSpoon.setQuantity(2.0);
		butterSpoon.setType(Types.SOUPSPOON);
		
		Can condensedCan = new Can();
		condensedCan.setQuantity(2.0);
		condensedCan.setType(Types.CAN);
		//end measures for the filling
		
		//ingredients for the filling
		Ingredient chocolatePowderFilling = new Ingredient();
		chocolatePowderFilling.setMeasure(chocolateFillingCup);
		chocolatePowderFilling.setName("Chocolate Powder");
		
		Ingredient butter = new Ingredient();
		butter.setName("Butter");
		butter.setMeasure(butterSpoon);
		
		Ingredient condMilk = new Ingredient();
		condMilk.setName("Condensed milk");
		condMilk.setMeasure(condensedCan);
		//end ingredients for the filling
		
		//listing filling ingredient
		List<Ingredient> recipeFillingList = new ArrayList<Ingredient>();
		
		recipeFillingList.add(chocolatePowderFilling);
		recipeFillingList.add(butter);
		recipeFillingList.add(condMilk);
		
		FillingRecipe recipeFilling = new FillingRecipe();
		recipeFilling.setIngredients(recipeFillingList);
		recipeFilling.setName("Brigadeiro's cake filling");
		
		Boolean fillingMixture = false;
		Boolean fillingCook = false;
		
		fillingMixture = recipeFilling.mixture(recipeFillingList);
		
		if (fillingMixture)
			fillingCook = recipeFilling.cook(recipeFillingList, 15.0);
		
		//end listing filling ingredient
		
		//measures for the cake cover
		Cup sprinklesCup = new Cup();
		sprinklesCup.setQuantity(0.5);
		sprinklesCup.setType(Types.TEACUP);
		
		Cup chocolateCoverCup = new Cup();
		chocolateCoverCup.setQuantity(1.0);
		chocolateCoverCup.setType(Types.TEACUP);
		
		Spoon butterSpoonCover = new Spoon();
		butterSpoonCover.setQuantity(2.0);
		butterSpoonCover.setType(Types.SOUPSPOON);
		
		Can condensedMilkCan = new Can();
		condensedMilkCan.setQuantity(2.0);
		condensedMilkCan.setType(Types.CAN);
		//end measures for the cake cover
		
		//ingredients for the cake cover
		Ingredient chocolateSprinkles = new Ingredient();
		chocolateSprinkles.setMeasure(sprinklesCup);
		chocolateSprinkles.setName("Chocolate Sprinkles");
		
		Ingredient chocolatePowderCover = new Ingredient();
		chocolatePowderCover.setMeasure(chocolateCoverCup);
		chocolatePowderCover.setName("Chocolate powder");
		
		Ingredient butterCover =  new Ingredient();
		butterCover.setMeasure(butterSpoonCover);
		butterCover.setName("Butter");
		
		Ingredient condensedMilkCover = new Ingredient();
		condensedMilkCover.setMeasure(condensedMilkCan);
		condensedMilkCover.setName("Condensed milk");
		//end ingredients for the cake cover
		
		//listing cake cover ingredient
		List<Ingredient> recipeCoverList = new ArrayList<Ingredient>();
		
		recipeCoverList.add(chocolateSprinkles);
		recipeCoverList.add(chocolatePowderCover);
		recipeCoverList.add(butterCover);
		recipeCoverList.add(condensedMilkCover);
		
		CakeCoverRecipe cakeCoverRecipe = new CakeCoverRecipe();
		cakeCoverRecipe.setIngredients(recipeCoverList);
		cakeCoverRecipe.setName("Brigadeiro's Cover");
		
		Boolean coverCook = false;
		Boolean coverMixture = false;
		
		coverMixture = cakeCoverRecipe.mixture(recipeCoverList);
		
		if(coverMixture)
			coverCook = cakeCoverRecipe.cook(recipeCoverList, 15.0);
		//end listing cake cover ingredient
		
		List<Recipe> compositesCake = new ArrayList<Recipe>();
		
		compositesCake.add(cakeRecipe);
		compositesCake.add(recipeFilling);
		compositesCake.add(cakeCoverRecipe);
		
		
		Cake brigadeirosCake = new Cake();
		brigadeirosCake.setRecipes(compositesCake);
		brigadeirosCake.setName("Brigadeiro's cake");
		Boolean cakeCut = false;
		Boolean cakeFill = false;
		Boolean cakeTogether = false;
		Boolean putCover = false;

		if(cakeBake)
			cakeCut = brigadeirosCake.cut(cakeRecipe);
		
		if(cakeCut && fillingCook)
			cakeFill = brigadeirosCake.fill(recipeFilling);
		
		if(cakeFill)
			cakeTogether = brigadeirosCake.group(cakeRecipe);
		
		if(cakeTogether && coverCook)
			putCover = brigadeirosCake.cover(cakeCoverRecipe);
		
		brigadeirosCake.isDone(brigadeirosCake.getName(), cakeTogether, cakeFill, putCover);
		
	}
}
