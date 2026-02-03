package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.project.login.loginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	  public static WebDriver driver;
	  public static Robot r;
	  public static Actions A;
      public static void browserLaungh(String name) {
    	  if(name.equals("chrome")) {
    		  
    		  WebDriverManager.chromedriver().setup(); 
    		     driver=new ChromeDriver();
    	  }
    	  else if(name.equals("edge")) {
    		  
    		  WebDriverManager.edgedriver().setup();
    	    	 driver = new EdgeDriver();
    	  }
    	  else {
    		  
    		  System.err.println("Invalid Browser");
    	  }
      }
      public static void urlLaunch(String url) {
    	  driver.get(url);
    	  driver.manage().window().maximize();
      }
      public static void impwait(int sec) {
    	  driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
      }
      public static void send (WebElement w,String value) {
    	 w. sendKeys(value);
      }
      
      public static void enter() throws AWTException {
    	   r = new Robot();
    	  r.keyPress(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);
      }
      public static void click(WebElement e) {
    	   A=new Actions(driver);
    	  A.click().perform();
      }
      public static void contextClick(WebElement e) {
   	   A=new Actions(driver);
   	  A.contextClick().perform();
     }
      public void screenshort() throws IOException {
    	  TakesScreenshot tk;
          tk=(TakesScreenshot)driver;
          File src = (File) tk.getScreenshotAs(OutputType.FILE);
          File dest=new  File("C:\\Users\\saravanakumar\\Desktop\\New folder\\Booking-Maven\\src\\test\\resources\\screenshort//1.png");
          FileUtils.copyFile(src,dest);
      }
      public static String excalRead(String filepath,String Sheetname,int row,int Cell) throws IOException {
    	  File f= new File(filepath);
  		FileInputStream fis=new FileInputStream(f);
  		XSSFWorkbook w=new XSSFWorkbook(fis);
  		XSSFSheet s = w.getSheet(Sheetname);
  		XSSFRow r = s.getRow(row);
  		XSSFCell c = r.getCell(Cell);
  		String value = c.toString();
  		return value;
      }
      public static void refresh() {
    	 driver.navigate().refresh();
      }
     public static void Quit() {
    	 driver.quit();
     }
     public void Serach1() {
    	 WebElement search=driver.findElement(By.name("ss"));
    	 send(search,"Singapore");
     }
     public void Date1() throws InterruptedException {
    	 WebElement d = driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']"));
    	 d.click();
    	 Thread.sleep(1000);
    	 WebElement A = driver.findElement(By.xpath("//span[@aria-label='Sa 14 February 2026']"));
    	 A.click();
     }public void Alt() throws InterruptedException {
    	 WebElement adu = driver.findElement(By.xpath("//button[@data-testid='occupancy-config']"));
    	 adu.click();

         WebElement done = driver.findElement(By.xpath("//span[text()='Done']"));
         done.click();
         
         WebElement srh = driver.findElement(By.xpath("//span[text()='Search']"));
         srh.click();
        
     }
     public void Hotel() throws InterruptedException, IOException {
    	 Thread.sleep(3000);
         WebElement hotel = driver.findElement(By.xpath("//div[contains(text(),'QT Sin')]"));
         hotel.click();
         Set<String>wh = driver.getWindowHandles();
         List<String> Li = new LinkedList<>();
         Li.addAll(wh);
         driver.switchTo().window(Li.get(1));
         TakesScreenshot tk;
         tk=(TakesScreenshot)driver;
         File src = (File) tk.getScreenshotAs(OutputType.FILE);
         File dest=new  File("C:\\Users\\saravanakumar\\Desktop\\New folder\\Booking-Maven\\src\\test\\resources\\screenshort\\1.png");
         FileUtils.copyFile(src,dest);
         
        
     }
     public void city() throws InterruptedException {
         WebElement name = driver.findElement(By.xpath("//a[@aria-label='Singapore']"));
         name.click();
         WebElement brakfast = driver.findElement(By.xpath("(//div[contains(text(),'Break')])[2]"));
         brakfast.click();
         WebElement hot = driver.findElement(By.xpath("(//div[contains(text(),'Very')])[2]"));
         hot.click();
         WebElement pluse = driver.findElement(By.xpath("(//div[contains(text(),'Fi')])[2]"));
         pluse.click();
         WebElement pluse2 = driver.findElement(By.xpath("(//div[contains(text(),'Dou')])"));
         pluse2.click();
         WebElement ok = driver.findElement(By.xpath("(//div[contains(text(),'5 st')])[2]"));
         ok.click();
         WebElement reat = driver.findElement(By.xpath("(//div[contains(text(),'Marina')])[1]"));
         reat.click();
     
         Thread.sleep(3000);
     }
     public void Booking() throws InterruptedException {
         WebElement CAL = driver.findElement(By.xpath("//div[@data-testid='searchbox-dates-container']"));
         CAL.click();
         Thread.sleep(3000);
         WebElement ent = driver.findElement(By.xpath("//span[@aria-label='Su 1 February 2026']"));
         ent.click();
         Thread.sleep(3000);
         WebElement Apply = driver.findElement(By.xpath("//sapn[text()='Apply changes']"));
         Apply.click();
         Thread.sleep(3000);
         WebElement room = driver.findElement(By.xpath("//select[@data-room-id='4861448'][1]"));
         room.click();
         Thread.sleep(3000);
         WebElement Rate = driver.findElement(By.xpath("//option[@value='4']"));
         Rate.click();
         Thread.sleep(3000);
         
     }
         
     
         
}     
    



