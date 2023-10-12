package dropdowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles();   //parentid, childid
		Iterator<String>it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		WebElement mailid = driver.findElement(By.cssSelector(".im-para.red"));
		System.out.println(mailid.getText());
		String Emailid = mailid.getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(Emailid);
		driver.switchTo().window(parentid);
		
		driver.findElement(By.id("username")).sendKeys(Emailid);
	
	}

}
