package ee.testMyPage;

import java.io.IOException;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.BananaTypes;
import pageObjects.FruitsAndVegetables;
import pageObjects.Groceries;
import pageObjects.Homepage;

public class AddIAmountB extends Hooks {
	
	public AddIAmountB() throws IOException {
		super();
	}

	
	
	@Test
	public void AddItem() throws IOException, InterruptedException {
		Homepage home = new Homepage();
		home.getLang().click();
		home.getGroc().click();
		
		Groceries ceries = new Groceries();
		ceries.getfrAndVe().click();
		
		FruitsAndVegetables fruve = new FruitsAndVegetables();
		fruve.getBananas().click();
		
		Actions action = new Actions(getDriver());
		BananaTypes types = new BananaTypes();
		action.moveToElement(types.getFairPlus()).perform();;
		for (int i = 0; i < 500; i++){
		types.getFairPlus().click();
		
		//delay added for presentation purpose
		Thread.sleep(500);
		}
		
	
		
		
	}
}
