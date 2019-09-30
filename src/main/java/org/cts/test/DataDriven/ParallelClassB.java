package org.cts.test.DataDriven;

import org.testng.annotations.Test;

public class ParallelClassB {

	@Test
	private void tc1() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
		System.out.println(Thread.currentThread().getId());	
	}
}
