 package org.project.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
	public  WebElement  userName(){
		return userName;	
	}
	
	@FindBy(xpath="//button[@data-testid='searchbox-dates-container']")
	private  WebElement cal;
	public  WebElement cal() {
		return cal;
	}
	
	@FindAll({
	    @FindBy(xpath = "//span[@aria-label='Sa 14 February 2026']"),
	    @FindBy(xpath = "//span[@data-date='2026-02-14']")
	})
	
	private WebElement date;
	public  WebElement date() {
		return date;
	}
	
	@FindBy(xpath="//button[@data-testid='occupancy-config']")
	private WebElement Adult;
	public WebElement Adult() {
		return Adult;
		
	}
	
	@FindBy(xpath="//span[text()='Done']")
	private WebElement Done;
	public WebElement Done() {
		return Done;
	}
	@FindBy(xpath="//span[text()='Search']")
	private WebElement ok;
	public WebElement ok() {
		return ok;
	}
	@FindBy(xpath="//a[@aria-label='Singapore']")
	private WebElement sing;
	public WebElement sing () {
		return sing;
	}
	@FindBy(xpath="(//div[contains(text(),'Break')])[2]")
	private WebElement brakefast;
	public WebElement brakefast() {
		return brakefast;
	}
	@FindBy(xpath="(//div[contains(text(),'Very')])[2]")
	private WebElement review;
	public WebElement review() {
		return review;
	}
	@FindBy(xpath="(//div[contains(text(),'Fi')])[2]")
	private WebElement gym;
	public WebElement gym() {
		return gym;
	}
	@FindBy(xpath="(//div[contains(text(),'Dou')])")
	private WebElement bet;
	public WebElement bet () {
		return bet;
	}
	@FindBy(xpath="(//div[contains(text(),'5 st')])[2]")
	private WebElement star;
	public WebElement star() {
		return star;
	}
	@FindBy(xpath="(//div[contains(text(),'Marina')])[1]")
	private WebElement marina;
	public WebElement marina() {
		return marina;
	}
	@FindBy(xpath="(//div[contains(text(),'Marina')])[2]")
			private WebElement Hot;
	public  WebElement Hot() {
		return Hot;
	}
	@FindBy(xpath="//span[contains(text(),'Show')]")
	private WebElement map;
	public WebElement map() {
		return map;
	}
	@FindBy(xpath="(//span[text()='View'])[2]")
	private WebElement view;
	public WebElement view(){
		return view;
	}
	@FindBy(xpath="(//span[contains(text(),'Sands P')])[2]")
	private WebElement room;
	public WebElement room() {
		return room;
	}
	@FindBy(id="24588248")
	private WebElement id;
	public WebElement id() {
		return id;
	}
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement sgin;
	public WebElement sgin() {
		return sgin;
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement mail;
	public WebElement mail() {
		return mail;
	}
	@FindBy(xpath="(//span[contains(text(),'Con')])[1]")
	private WebElement Continue;
	public WebElement Continue() {
		return Continue;
	}
	@FindBy(name="firstname")
	private WebElement first;
	public WebElement first() {
		return first;
	}
	@FindBy(name="lastname")
	private WebElement last;
	public WebElement last() {
		return last;
	}
	@FindBy(name="email")
	private WebElement email;
	public WebElement Email() {
		return email;
	}
	@FindBy(name="phoneNumber")
	private WebElement loc;
	public WebElement loc() {
		return loc;
	}
	@FindBy(xpath="//span[contains(text(),' Next')]")
	private WebElement yes;
	public WebElement yes() {
		return yes;
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
	  public static void enter() throws AWTException {
   	   r = new Robot();
   	  r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
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
	public void rest() throws InterruptedException {
		Thread.sleep(5000);
//		marina().click();
		
		Hot.click();
		 Set<String>wh = driver.getWindowHandles();
         List<String> Li = new LinkedList<>();
         Li.addAll(wh);
         driver.switchTo().window(Li.get(1));
         Thread.sleep(3000);
		

	}
	public void email() {
		mail().sendKeys("saravanask00001@gmail.com");
	}
	public void login() throws InterruptedException {
     	sgin().click();
     	email();
     	Continue().click();
    	Thread.sleep(25000);
	}
	public void name() throws InterruptedException {
		Thread.sleep(2000);
		first().sendKeys("KUMAR");
		last().sendKeys("G");
	}
	public void Mail() {
		Email().sendKeys("kumar123@gmail.com");
	}
	public void phone() {
		loc().sendKeys("9632147850");;
		
	}
	public void window() throws InterruptedException {
		Thread.sleep(2000);
		
		Set<String>wh = driver.getWindowHandles();
        List<String> Li = new LinkedList<>();
        Li.addAll(wh);
        driver.switchTo().window(Li.get(1));
        Thread.sleep(3000);
        Set<String>w = driver.getWindowHandles();
        List<String> L = new LinkedList<>();
        L.addAll(w);
        driver.switchTo().window(L.get(0));
	}
	public void contition() throws InterruptedException {
		Thread.sleep(2000);
		brakefast().click();
		Thread.sleep(2000);
		review().click();
		Thread.sleep(2000);
		bet().click();
	}
}
   
