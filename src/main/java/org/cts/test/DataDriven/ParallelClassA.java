package org.cts.test.DataDriven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelClassA {

	@Test
	private void tc1() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		
		System.out.println(Thread.currentThread().getId());
	}
	@Test(retryAnalyzer=RetryB.class)
	private void tc3() {
		System.out.println(Thread.currentThread().getId());	
		Assert.assertTrue(false);
	}
	
}
