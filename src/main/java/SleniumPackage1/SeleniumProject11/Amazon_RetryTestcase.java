package SleniumPackage1.SeleniumProject11;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Amazon_RetryTestcase implements IRetryAnalyzer
{
 int current_count=0;
 int retry_cocunt=1;
 
 
@Override
public boolean retry(ITestResult result) 
{
	 if(current_count<retry_cocunt)
	 {
		 return true;
	 }
	 return false;
	
}
}
