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
	public static void AfterClass() {
		//Quit();
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
	public void a() throws InterruptedException, AWTException {
		impwait(15);
		Thread.sleep(3000);
		Thread.sleep(3000);
		enter();
		Serach1();
		Thread.sleep(3000);
		 Date1();
		 Thread.sleep(3000);
		 Alt();
		 Thread.sleep(3000);
		System.out.println("Test");
	}
	@Test
	public void b() throws InterruptedException, IOException {
		Hotel();
		Thread.sleep(1000);
		map();
		Thread.sleep(1000);
		Booking();
		Thread.sleep(1000);
		System.out.println("Test");
	}

}
