package org.cts.test.DataDriven;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TC1 extends ProjBaseclass {
    @Parameters({"Source","Destination"})
	@Test(priority=4,enabled=false)
	private void tc1(String s1,String s2) throws AWTException, InterruptedException {
		
		getDriver();		
		loadurl("https://www.norwegian.com/uk/");
		Projpojo pp=new Projpojo();
		//both the values are valid
		fill(pp.getSource(),s1);
		buttonClick(pp.getSource());
		robot();
		robot2();
		fill(pp.getDestination(),s2);
		robot2();
		}
    @Parameters({"Sourc","Destinatio"})
	@Test(priority=3)
	private void tc2(@Optional("Chennai")String s1,@Optional("Madurai")String s2) throws InterruptedException, AWTException {
		getDriver();		
		loadurl("https://www.norwegian.com/uk/");
		
		Projpojo pp=new Projpojo();
		//both the values are invalid
		fill(pp.getSource(),s1);
        buttonClick(pp.getSource());
		fill(pp.getDestination(),s2);

	}
    @Parameters({"Sourc","Destination"})
    @Test(priority=1)
	private void tc3(@Optional("Chennai")String s1,String s2) throws InterruptedException, AWTException {
		getDriver();		
		loadurl("https://www.norwegian.com/uk/");
		Projpojo pp=new Projpojo();
		
		//source value is invalid
		fill(pp.getSource(),s1);
		buttonClick(pp.getSource());	
		fill(pp.getDestination(),s2);
		robot2();
    }
    @Parameters({"Source","Destinatio"}) 
	@Test(priority=2)
	private void tc4(String s1,@Optional("Kolkata")String s2) throws InterruptedException, AWTException {
		getDriver();		
		loadurl("https://www.norwegian.com/uk/");
		Projpojo pp=new Projpojo();
		
		//Destination value is invalid
		fill(pp.getSource(),s1);
		buttonClick(pp.getSource());
		Thread.sleep(2000);
		robot();
		robot2();
		fill(pp.getDestination(),s2);
	}	
    @Parameters({"Source","Destination"})
	@Test(priority =5)
	private void tc5(String s1,String s2)	throws InterruptedException, AWTException {
		
		getDriver();		
		loadurl("https://www.norwegian.com/uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Projpojo pp=new Projpojo();
		
		//both the values are valid
		fill(pp.getSource(),s1);
		buttonClick(pp.getSource());
		Thread.sleep(2000);
		robot();
		robot2();
		
		fill(pp.getDestination(),s2);
		robot2();
		
		//select bothways with valid dates 
		buttonClick(pp.getBothways());
	    buttonClick(pp.getCalenderinput());
	    Thread.sleep(3000);
	    buttonClick(pp.getFromdate());
	    Thread.sleep(3000);
	    buttonClick(pp.getTodate());
	    Thread.sleep(3000);
	    buttonClick(pp.getSearch());
	    
}
}