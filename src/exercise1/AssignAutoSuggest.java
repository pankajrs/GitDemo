package exercise1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignAutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(3000);
		
		List<WebElement> Options = driver.findElements(By.cssSelector("li.ui-menu-item div"));
		
		for(WebElement Option: Options)
		{
			if(Option.getText().equalsIgnoreCase("United Kingdom (UK)")) 
			{
				Option.click();
				//break;
			}
		}
	}

}
