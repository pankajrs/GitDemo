package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		WebElement move1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		//moves to specific element
		a.moveToElement(move1).build().perform();
		Thread.sleep(3000);
		//for CAPITAL letters and double click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//for right click
		a.moveToElement(move1).contextClick().build().perform();
		
		
	}

}
