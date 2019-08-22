package org.cts.test.DataDriven;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Iciciandsnapdeal {
	static WebDriver driver;
	@BeforeClass
	public static void launchbrowser() {
		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\DataDriven\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.getTitle();
		 
		 	}
	@Ignore
	@Test
	  public void icici() throws InterruptedException {
		 driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.14981750.1792544160.1566283678-726797098.1566283678");	
		Thread.sleep(5000);
		 WebElement user =driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		user.sendKeys("abc@gmail.com");
		WebElement pass =driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		user.sendKeys("abc");
		 Assert.assertTrue(driver.getTitle().contains("icici"));
		 
		}
	@Test
	  public void snapdeal() {
		 driver.get("https://www.snapdeal.com/login");	
		WebElement user =driver.findElement(By.id("userName"));
		user.sendKeys("abc@gmail.com");
		 Assert.assertTrue(driver.getCurrentUrl().contains("https"));
		 
		}


}
