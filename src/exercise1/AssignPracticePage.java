package exercise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignPracticePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption3")).click(); //1
		
		WebElement Op3 = driver.findElement(By.xpath("//div/div[4]/fieldset/label[3]"));  //2
		String Opt3  = Op3.getText();
		System.out.println(Op3.getText());
		
		Select dropdown = new Select(driver.findElement(By.xpath("//div/div[3]/fieldset/select")));
		dropdown.selectByVisibleText(Opt3); //3
		
		driver.findElement(By.id("name")).sendKeys(Opt3); //4
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		
		//Hello Option3, share this practice page and share your knowledge
		String Alertm = driver.switchTo().alert().getText();
		
		if(Alertm.contains(Opt3))
		{
			System.out.println("Alert message is true as it contains "+Opt3);
		}
		else
		{
			System.out.println("Something went wrong as it does not contain "+Opt3);
		}
		
	}

}
