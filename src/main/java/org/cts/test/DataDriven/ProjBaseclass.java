package org.cts.test.DataDriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjBaseclass {
	
	static WebDriver driver;
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Seleniumpractice\\newdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;
		}
	public static void loadurl(String url) {
		driver.get(url);
	}
	
  public static void fill(WebElement element,String value) {
		element.sendKeys(value);               
	}
  public static void buttonClick(WebElement element) throws InterruptedException {
	 element.click();
	 
	
  } 
	 public static void robot() throws AWTException {
		 Robot r=new Robot();
		 for(int i=1;i<=2;i++){
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
		 }	
		 }
	 public static void robot2() throws AWTException, InterruptedException	{	
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);	
		}
  public static void accClick(WebElement element) {
	  Actions a=new Actions(driver);
	  a.click(element).perform();
	  
  }
}

