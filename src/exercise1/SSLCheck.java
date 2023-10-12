package exercise1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		Options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("download.default_directory", "/directory/path");
		Options.setExperimentalOption("prefs", prefs);
		
		Options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		

	}

}
