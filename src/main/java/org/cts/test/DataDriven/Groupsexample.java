
package org.cts.test.DataDriven;

import org.testng.annotations.Test;

public class Groupsexample {

	@Test(groups= {"regresssion"})
	private void tc1() {
		System.out.println("1");

	}
	@Test(groups= {"smoke"})
	private void tc2() {
		System.out.println("2");	

	}
	@Test(groups= {"smoke"})
	private void tc3() {
		System.out.println("3");

	}
	@Test(groups= {"sanity"})
	private void tc4() {
		System.out.println("4");

	}
	@Test(groups= {"regression"})
	private void tc5() {
		System.out.println("5");

	}
	
	
}
