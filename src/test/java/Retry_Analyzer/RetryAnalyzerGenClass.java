package Retry_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerGenClass implements IRetryAnalyzer {

	int count=0;
	int trycount=3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<trycount)
		{
			count++;
			return true;
		}
		return false;
	}

	
	
}
