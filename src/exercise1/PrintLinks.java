package exercise1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1.Give me the count of links on the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Give me the count of links on footer section
		WebElement footer = driver.findElement(By.cssSelector("table.gf-t")); //Limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		//3.-first part of footer
		WebElement footer1 = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
		//4. Click on each link in the colomn and check it the pages are opening-
		for(int i=1; i<footer1.findElements(By.tagName("a")).size(); i++)
		{
			WebElement linkclick = footer1.findElements(By.tagName("a")).get(i);
			Actions a = new Actions(driver);
			a.moveToElement(linkclick).keyDown(Keys.CONTROL).click().build().perform();
			Thread.sleep(5000);
		}	
			
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
			
	}

}
