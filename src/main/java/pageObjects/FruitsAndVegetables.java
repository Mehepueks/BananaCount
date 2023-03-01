package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class FruitsAndVegetables extends BasePage{
	
	public WebDriver driver;
	
	
	By fruit = By.cssSelector("[data-href='\\/products\\/16972'] .name");
	By vegetables = By.cssSelector("[data-href='\\/products\\/16974'] .name");
	By potatoes = By.cssSelector("[data-href='\\/products\\/16977'] .name");
	By vegetables2 = By.cssSelector("[data-href='\\/products\\/16973'] .name");
	By berries = By.cssSelector("[data-href='\\/products\\/16975'] .name");

	By mushrooms = By.cssSelector("[data-href='\\/products\\/16976'] .name");

	By driedHerbs = By.cssSelector("div:nth-of-type(7)  .js-category-item.name");
	
	By bananas = By.cssSelector(".categories-shelf > div:nth-of-type(1)  .categories-list.hidden-xs > li:nth-of-type(1) > .js-category-item");
	
	
	public WebElement getFruit() throws IOException {
		this.driver = getDriver();
		return driver.findElement(fruit);
	}
	
	public WebElement getVegetables() throws IOException {
		this.driver = getDriver();
		return driver.findElement(vegetables);
	}
	
	public WebElement getPotatoes() throws IOException {
		this.driver = getDriver();
		return driver.findElement(potatoes);
	}
	
	public WebElement getVegetables2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(vegetables2);
	}

		public WebElement getBerries() throws IOException {
			this.driver = getDriver();
			return driver.findElement(berries);
			
		}
	public WebElement getMushrooms() throws IOException {
		this.driver = getDriver();
		return driver.findElement(mushrooms);
	}
	
	public WebElement getDriedHerbs() throws IOException {
		this.driver = getDriver();
		return driver.findElement(driedHerbs);
	}
	
	public WebElement getBananas() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bananas);
		
	}
	
	

	public FruitsAndVegetables() throws IOException {
		super();
	}
	
}