package org.cts.test.DataDriven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng2 {

@Parameters({"use"})
 @Test	
 private void tc3(@Optional("priya0705")String s2) {
	 System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\DataDriven\\driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");	
	  WebElement user =driver.findElement(By.id("email"));
	  user.sendKeys(s2);

	}
 @Test
 private void tc4() {
	
 System.out.println("bb");
}
}
