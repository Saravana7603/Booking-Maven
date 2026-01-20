package org.project.login;

import java.awt.AWTException;
import java.io.IOException;

import org.project.BaseClass;

public class pomPage extends BaseClass {
	public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		browserLaungh("chrome");
   	    urlLaunch("https://www.booking.com");
     	impwait(15); 
     	Thread.sleep(1000);
     	enter();
     	loginPage li= new loginPage();
        li.search(); 
        Thread.sleep(3000);
     	Quit();
		
		}

}
