package testScriptt;

import org.testng.ITestListener;

import org.testng.ITestResult;

public class Listenerss implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I am successfully executed "+ result.getMethod().getMethodName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("I am successfully not executed"+result.getMethod().getMethodName());
	}
	public void OnTestStart(ITestResult result){
		System.out.println("I am Started"+ result.getMethod().getMethodName());
		
			
	}
	public void OnTestSkipped(ITestResult result) {
		System.out.println("I am skipped"+result.getMethod().getMethodName());
		
	}
	
}
