package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChrome {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// set up the chromedriver using WebDriverManager

		WebDriverManager.chromedriver().setup();	
		
		try {
			
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// fetch the title of the web page and print it on the console
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			// close the current browser session
			
			//driver.close();
			
			
			
			
			
		}catch 	(Exception e) {
			
			e.printStackTrace();
		
		

	}

}
}
