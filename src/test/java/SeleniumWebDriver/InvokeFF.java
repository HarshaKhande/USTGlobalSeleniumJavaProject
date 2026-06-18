package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFF {
	
	
	static WebDriver driver;
	
	
	@Test
	public 	void invokeFFBrowser() {
		

		// set up the FFdriver using WebDriverManager

				WebDriverManager.firefoxdriver().setup();	
				
				try {
					
					driver = new FirefoxDriver();
					driver.get("https://www.saucedemo.com/");
					
					// Maximize the browser window
					driver.manage().window().maximize();
					
					// close the current browser session
					
				//	driver.close();
					
					
					
					
					
				}catch 	(Exception e) {
					
					e.printStackTrace();
				
				

			}



	}


}
