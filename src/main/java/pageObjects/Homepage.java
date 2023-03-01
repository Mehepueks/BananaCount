package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{
	
	public WebDriver driver;
	
	/*The following script is created for practice and presentation purposes.
	 * Therefore the following elements of the home page includes only a small selection: 
	 * 
	 * Language Button (English)
	 * "Groceries" Link
	 * "Household products" link
	 * "Home" link
	 * "Recipes" link
	 * "Special offers" link
	 * 
	 * 

	 * */
	
	//Language Button (English)
	By lang = By.cssSelector("[data-language='en']");
	
	//Groceries
	By groc = By.cssSelector("li#js-root-products  .inner-link");
	
	//Household products
	By housProd = By.cssSelector(".main-navigation-items [role='menuitem']:nth-of-type(3) .inner-link");
	
	//Home
	By home = By.cssSelector("li#js-root-  .inner-link");
	
	//Recipes
	By recipes = By.cssSelector(".main-navigation-items [role='menuitem']:nth-of-type(5) .inner-link");
	
	//Special offers
	By specOff = By.cssSelector("li#js-root-offers  .inner-link");
	
	public WebElement getLang() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lang);
		
	}
	
	public WebElement getGroc() throws IOException {
	this.driver = getDriver();
	return driver.findElement(groc);
	
	}
	
	public WebElement getHousProd() throws IOException {
		this.driver = getDriver();
		return driver.findElement(housProd);
	}

	public WebElement getHome() throws IOException {
		this.driver = getDriver();
		return driver.findElement(home);
	}
	
	public WebElement getRecipes() throws IOException {
		this.driver = getDriver();
		return driver.findElement(recipes);
		
	}
	
	public WebElement getSpecOff() throws IOException {
		this.driver = getDriver();
		return driver.findElement(specOff);
	}
	
	

	public Homepage() throws IOException {
		super();
	}
}
