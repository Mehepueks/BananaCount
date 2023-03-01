package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Groceries extends BasePage{
	
	public WebDriver driver;
	
	By frAndVe = By.linkText("Fruits and vegetables");
	By meat = By.cssSelector("[data-href='\\/products\\/16930'] .name");
	By fish = By.cssSelector("[data-href='\\/products\\/16931'] .name");
	By milk = By.cssSelector("[data-href='\\/products\\/16932'] .name");
	By cheese = By.cssSelector("[data-href='\\/products\\/16932'] .name");
	By eggs = By.cssSelector("[data-href='\\/products\\/16932'] .name");
	By oils = By.cssSelector("[data-href='\\/products\\/16932'] .name");
	By readyMFood = By.cssSelector("[data-href='\\/products\\/16932'] .name");
	
	
	public WebElement getfrAndVe() throws IOException  {
	this.driver = getDriver();
	return driver.findElement(frAndVe);
	}
	
	public WebElement getMeat() throws IOException {
		this.driver = getDriver();
		return driver.findElement(frAndVe);
	}
	
	public WebElement getFish() throws IOException {
		this.driver = getDriver();
		return driver.findElement(fish);	
	}
	
	public WebElement getMilk() throws IOException {
		this.driver = getDriver();
		return driver.findElement(milk);
	}
	
	public WebElement getCheese() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cheese);
	}
	
	public WebElement getEggs() throws IOException {
		this.driver = getDriver();
		return driver.findElement(eggs);
	}
	
	public WebElement getOils() throws IOException {
	this.driver = getDriver();	
	return driver.findElement(oils);
	}
	
	public WebElement getReadyMFood() throws IOException {
		this.driver = getDriver();
		return driver.findElement(readyMFood);
	}
	
	public Groceries() throws IOException {
		super();
		
	}
	
	

}
