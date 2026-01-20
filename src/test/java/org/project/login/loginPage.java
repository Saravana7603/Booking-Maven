 package org.project.login;

import java.awt.event.KeyEvent;
import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.project.BaseClass;

public class loginPage extends BaseClass  {
	public loginPage() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="ss")
	private  WebElement userName;
	
	@FindBy(xpath="//button[@data-testid='searchbox-dates-container']")
	private  WebElement cal;
	
	@FindAll({
	    @FindBy(xpath = "//span[@aria-label='Th 22 January 2026']"),
	    @FindBy(xpath = "//span[@data-date='2026-01-22']")
	})
	private WebElement date;
	
	@FindBy(xpath="//button[@data-testid='occupancy-config']")
	private WebElement Adult;
	
	@FindBy(xpath="//span[text()='Done']")
	private WebElement Done;
	@FindBy(xpath="//span[text()='Search']")
	private WebElement ok;
	@FindBy(xpath="//div[contains(text(),'Grand H')]")
	private WebElement hyatt;
	@FindBy(xpath="//button[@data-map-trigger-button='1']")
	private WebElement Map;
	@FindBy(xpath="//span[text()='View']")
	private WebElement view;
	@FindBy(xpath="//input[@value='room']")
	private WebElement room;
	@FindBy(xpath="//span[contains(text(),'Deluxe K')]")
	private WebElement type;

	
	
	
	public  WebElement  userName(){
		return userName;	
	}
	
	public  WebElement cal() {
		return cal;
	}
	public  WebElement date() {
		return date;
	}
	public WebElement Adult() {
		return Adult;
		
	}
	public WebElement Done() {
		return Done;
	}
	public WebElement ok() {
		return ok;
	}
	public WebElement hyatt() {
		return hyatt;
	}
	public WebElement Map() {
		return Map;
	}
	public WebElement room() {
		return room;
	}
	public WebElement view () {
		return view;
	}
	public WebElement Type() {
		return type;
	}
	
	
	
	public void search() throws IOException, InterruptedException  {
	
//		userName().sendKeys(excalRead ("C:\\Users\\Saravana\\.echlips\\New folder\\NewMaven\\src\\test\\resources\\Data\\Data.xlsx", "Sheet1", 1, 1));
//		refresh();
//		Thread.sleep(3000);
//		userName().sendKeys(excalRead ("C:\\Users\\Saravana\\.echlips\\New folder\\NewMaven\\src\\test\\resources\\Data\\Data.xlsx", "Sheet1", 2, 1));
//		refresh();
//		Thread.sleep(3000);
//		userName().sendKeys(excalRead ("C:\\Users\\Saravana\\.echlips\\New folder\\NewMaven\\src\\test\\resources\\Data\\Data.xlsx", "Sheet1", 3, 1));
		
		
	}
	
	

	public void Date() throws InterruptedException {
		cal().click();
		
		Thread.sleep(5000);
		date().click();
		
	}
	public void Member() {
		Adult().click();
		Done().click();
	}
	public void Enter() {
		ok().click();
	}
	public void Hotel() {
		A.contextClick(hyatt);
         r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}
}
   
