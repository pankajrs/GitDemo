package exercise1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablesAssignment {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.id("product"));

		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
		
		/*
		 * List<WebElement> raws =
		 * driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
		 * 
		 * int rawno = raws.size();
		 * System.out.println("Total number of raws are "+rawno); //1
		 * 
		 * List<WebElement> columns =
		 * driver.findElements(By.xpath("//fieldset/table/tbody/tr/th"));
		 * 
		 * int colno = columns.size();
		 * System.out.println("Total number of columns are "+colno); //2
		 * 
		 * String Fraw1 =
		 * driver.findElement(By.xpath("//fieldset/table/tbody/tr/td[1]")).getText();
		 * String Fraw2 =
		 * driver.findElement(By.xpath("//fieldset/table/tbody/tr/td[2]")).getText();
		 * String Fraw3 =
		 * driver.findElement(By.xpath("//fieldset/table/tbody/tr/td[3]")).getText();
		 * 
		 * System.out.println(Fraw1); System.out.println(Fraw2);
		 * System.out.println(Fraw3); //3
		 */		
	}

}
