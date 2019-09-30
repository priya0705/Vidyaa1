package org.cts.test.DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserClassA {
	
	static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String s1) {
		if(s1.equals("opera")) {
			System.setProperty("webdriver.opera.driver","D:\\Eclipse workspace\\DataDriven\\opera\\operadriver.exe");
            driver=new OperaDriver();
            driver.get("https://web.whatsapp.com");
            
		}  
		else if(s1.equals("chrome"))
            {
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\DataDriven\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com/");
            }
		}
	}

