package testngFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before any method execution in this class");
	}

	@Parameters({ "URL", "APIKey/username" })
	@Test
	public void WebLoginCarLoan(String urlname, String Key) {
		// selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(Key);
	}

	@AfterMethod
	public void Afterevery() {
		System.out.println(" I will execute after every method in day3 class");
	}

	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String username, String password) {
		// Appium
		System.out.println("MobileLoginCar");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am no 1");
	}

	@Test(enabled = false)
	public void MobileSigninCarLoan() {
		// Appium
		System.out.println("Mobile SignIN");
	}

	@Test(groups = { "Smoke" })
	public void MobileSignoutCarLoan() {
		// Appium
		System.out.println("Mobile Signout");
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println(" I will execute before every method in day3 class");
	}

	@Test
	public void APICarLoan() {
		// Rest API automation
		System.out.println("APICarLoan");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination -username password- good credit history
		// 2nd - username password- no credit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// columns in the row are nothing but values for that particular combination

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;

	}

}
