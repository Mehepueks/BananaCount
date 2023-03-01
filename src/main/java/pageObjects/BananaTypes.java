package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class BananaTypes extends BasePage {
	
	public WebDriver driver;
	
	
	//Banaan Del Monte
	By montePlus =  By.cssSelector("[data-ean='2060400700007'] .icon-ios7-plus-empty");
	By monteMinus = By.cssSelector("[data-ean='2060400700007'] .icon-ios7-minus-empty");
	
	//Banaan Fair Trade
	By fairPlus =  By.cssSelector("li:nth-of-type(2) .icon-ios7-plus-empty");
	By fairMinus = By.cssSelector("li:nth-of-type(2) .icon-ios7-minus-empty");
	
	
	
	public WebElement getMontePLus() throws IOException {
		this.driver = getDriver();
		return driver.findElement(montePlus);
	}

	public WebElement getMonteMinus() throws IOException {
	this.driver = getDriver();
	return driver.findElement(monteMinus);
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public WebElement getFairPlus() throws IOException {
		this.driver = getDriver();
		return driver.findElement(fairPlus);
	}
	
	public WebElement getFairMinus() throws IOException {
	this.driver = getDriver();
	return driver.findElement(fairMinus);
	}
	
	public BananaTypes() throws IOException {
		super();
	}
}
