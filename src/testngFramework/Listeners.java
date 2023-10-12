package testngFramework;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

//ITestListeners interface which implements Testing listeners
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("I successfully executed Listeners pass code");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//response if API is failed
		System.out.println("I failed executed Listeners pass code" +result.getName());
	}
	
	@Override
	public void onStart(ITestContext result) {
		
		
	}

	

}
