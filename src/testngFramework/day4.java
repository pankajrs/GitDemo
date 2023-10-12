package testngFramework;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	public void LoginAPICarLoan()
	{
		//Rest API automation
		System.out.println("LoginAPIHomeLoan");
	}

}
