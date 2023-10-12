package dropdowns;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bucket {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Cauliflower","Beetroot"};
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			//Brocolli - 1 Kg
		String[] name = products.get(i).getText().split("-");
		String formattedname = name[0].trim();
		
		//format is to get actual vegetable name
		//convert array into array list for easy search
		//check whether name you extracted is present in arrayList or not
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
			
		int j=0;
		if(itemsNeededList.contains(formattedname))
		{
			j++;
			//Click on add to Cart
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();


			if(j==3) {
				break;
			}
			
		}
		}
		

	}

}
