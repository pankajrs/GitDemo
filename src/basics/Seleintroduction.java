package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleintroduction {
	public static void main(String[] args) {
		
		//invoke browser
		//Chrome - ChromeDriver -->Methods
		//Firefox- FirefoxDriver -->methods
		//WebDriver close get
		//WebDriver methods + class methods
		//System.setProperty("webdriver.chrome.driver", "/D:/SeleniumPractice/chromedri/chromedriver");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		driver.quit();
		
	}

}
