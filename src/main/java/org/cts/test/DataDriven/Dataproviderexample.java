package org.cts.test.DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {
   
	@Test(dataProvider="res")
	private void tc1(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}
	
	@DataProvider(name="res")
	public Object[][] data(){
		return  new Object[][] {{"aa","bb"},{"bb","cc"}};
}
}