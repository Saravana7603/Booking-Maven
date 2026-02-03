package org.project.TestNG;

import java.awt.AWTException;

import org.project.BaseClass;
import org.project.login.loginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNg extends BaseClass {

	@BeforeMethod
	public static void before() throws InterruptedException {
		browserLaungh("chrome");
		
		
	}
	@AfterMethod
	public static void after() {
//		driver.quit();
	}
	@Parameters({"userName"})
	@Test
	public static void Test1(@Optional("Singapore") String user) throws InterruptedException, AWTException {
		urlLaunch("https://www.booking.com/");
		impwait(15);
     	Thread.sleep(3000);
     	enter();
     	loginPage li=new loginPage();
//        li.login();
		li.userName().sendKeys(user);
		li.cal().click();
		li.date().click();
		Thread.sleep(2000);
		li.Adult().click();
		li.Done().click();
		li.ok().click();
		li.contition();
    	li.rest();
    	li.map().click();
    	li.view().click();
    	li.room().click();
    	li.id().click();
    	li.name();
    	li.Mail();
    	li.phone();	
    	li.yes().click();
    	Thread.sleep(3000);
	}
	
	
}



