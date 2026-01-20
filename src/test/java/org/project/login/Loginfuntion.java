package org.project.login;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.project.BaseClass;

public class Loginfuntion extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaungh("chrome");
   	    urlLaunch("https://www.booking.com");
     	impwait(15); 
     	Thread.sleep(5000);
     	enter();
    	 WebElement search=driver.findElement(By.name("ss"));
    	 send(search,"singapore");
    	 Thread.sleep(5000);
    	 WebElement day = driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']"));
         day.click();
       

         WebElement date= driver.findElement(By.xpath("//span[@aria-label='Mo 22 December 2025']"));
         date.click();
 Thread.sleep(1000);
        
         
         WebElement memb = driver.findElement(By.xpath("//span[text()='2 adults · 0 children · 1 room']"));
         memb.click();
         Thread.sleep(2000);
         
                 
         WebElement done = driver.findElement(By.xpath("//span[text()='Done']"));
         done.click();
         Thread.sleep(2000);
         WebElement bar = driver.findElement(By.xpath("//span[text()='Search']"));
         bar.click();
         Thread.sleep(2000);
         System.out.println("✔ Chennai Search & Date Selection & Adult Selection & Room  Search Successful!");
         
	}
}
