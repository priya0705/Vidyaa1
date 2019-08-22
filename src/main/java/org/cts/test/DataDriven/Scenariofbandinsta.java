package org.cts.test.DataDriven;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Scenariofbandinsta {
     
	static WebDriver driver;
	@BeforeClass
	public static void launchbrowser() {
		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.getTitle();
		 
		 	}
	
	@Test
	  public void facebooklogin() {
		 driver.get("https://www.facebook.com/");	
		WebElement user =driver.findElement(By.id("email"));
		user.sendKeys("abc@gmail.com");
		 Assert.assertEquals("abc@gmail.com", user.getAttribute("value"));
		 Assert.assertTrue(driver.getTitle().contains("Facebook"));
		 
		}
	@Ignore
	@Test
	  public void instagram() {
		 driver.get("https://www.instagram.com/accounts/login/?hl=en");	
		WebElement user =driver.findElement(By.name("username"));
		user.sendKeys("abc@gmail.com");
		 Assert.assertTrue(driver.getCurrentUrl().contains("https"));
		 
		}
}