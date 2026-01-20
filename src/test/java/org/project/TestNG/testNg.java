package org.project.TestNG;

import org.testng.annotations.Test;

import java.awt.AWTException;

import org.project.BaseClass;
import org.project.login.loginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class testNg extends BaseClass {
	@BeforeMethod
	public static void before() throws InterruptedException {
		browserLaungh("chrome");
		
		
	}
	@Parameters({"userName"})
	@Test
	public static void Test1(@Optional("Bangluore") String user) throws InterruptedException, AWTException {
		urlLaunch("https://www.booking.com/");
		impwait(15);
		Thread.sleep(3000);
		enter();
		loginPage li=new loginPage();
		li.userName().sendKeys(user);
		Thread.sleep(3000);
		li.cal().click();
		Thread.sleep(3000);
		li.date().click();
		Thread.sleep(3000);
		li.Adult().click();
		Thread.sleep(3000);
		li.Done().click();
		Thread.sleep(3000);
		li.ok().click();
		Thread.sleep(3000);
		li.Hotel();
		Thread.sleep(3000);
		li.Map().click();
		Thread.sleep(3000);
		li.view().click();
		Thread.sleep(3000);
		li.room().click();
		Thread.sleep(3000);
		li.Type().click();
		Thread.sleep(3000);
		
	}
}



