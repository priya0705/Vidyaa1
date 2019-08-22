package org.cts.test.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngTest {

@Parameters({"username"})
@Test(priority=2)
private void tc1(String s1){
	 
		 System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\DataDriven\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");	
		  WebElement user =driver.findElement(By.id("email"));
		  user.sendKeys(s1);
}
@Test(priority=-10,enabled=false)
 private void tc2() {
	System.out.println("12345");

}
@Test(priority=7,invocationCount=5)
 private void tc3() {
	System.out.println("123");

}
	 
}
