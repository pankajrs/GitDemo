package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Raju Singh");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("herapheri@gmail.com");
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Genderdrop = driver.findElement(By.id("exampleFormControlSelect1"));

		Select Gender = new Select(Genderdrop);
		Gender.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio2")).click();
		//driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02/02/1992");
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
