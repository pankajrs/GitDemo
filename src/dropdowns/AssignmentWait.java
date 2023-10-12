package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement Asof= driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(Asof);
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2500);

		List<WebElement> products = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		
		for(int i=0; i<products.size(); i++) 
		{
			products.get(i).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		
	}
}
