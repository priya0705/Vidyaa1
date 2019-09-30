package org.cts.test.DataDriven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryB implements IRetryAnalyzer {

	int min=0,max=10;
	@Override
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	
	
}
