package org.cts.test.DataDriven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssert {
    @Test
	private void one() {
		
     SoftAssert s=new SoftAssert();
     s.assertTrue(true, "title");
     s.assertTrue(false, "url");
     s.assertTrue(true, "uname");
     s.assertAll();
	}
    @Test
	private void two() {
		Assert.assertTrue(true,"url");
		Assert.assertTrue(false,"title");
		Assert.assertTrue(true,"uname");
		
	

	}
} 
