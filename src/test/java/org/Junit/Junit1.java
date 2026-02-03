		package org.Junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.project.BaseClass;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;


public class Junit1 extends BaseClass {
	@BeforeClass
	public static void BeforeClass() {
		browserLaungh("chrome");
		System.out.println("Before class");
		
	}
	@AfterClass
	public static void AfterClass() throws InterruptedException {
	Thread.sleep(3000);
//     Quit();
		System.out.println("AfterClass");
	}
	@Before
	public void Before () {
		urlLaunch("https://www.booking.com");
		System.out.println("Before");
	}
	@org.junit.After
	public void After() {
		System.out.println("After");
	}
	@Test
	public void a() throws InterruptedException, AWTException, IOException {
		impwait(15);
		Thread.sleep(3000);
		enter();
		Serach1();
		 Date1();
		 Alt();
		
		System.out.println("Test");
	}
	@Test
	public void b() throws InterruptedException, IOException {
		
		city();
		System.out.println("Test");
	}
	@Test
	public void c() throws InterruptedException, IOException {
		Hotel();
		
	}

}
