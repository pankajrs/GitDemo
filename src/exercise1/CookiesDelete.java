package exercise1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;



public class CookiesDelete {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("D:\\SeleniumPractice\\Screenshots\\sample1.png"));
		
		
	}

}
