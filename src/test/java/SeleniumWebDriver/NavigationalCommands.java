package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();	
		
		try {
			
	
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// driver back 
			
			driver.navigate().back();
			
			// java command to wait for 2 seconds
			
			Thread.sleep(4000);
			
			// driver forward
			
			driver.navigate().forward();
			
			Thread.sleep(4000);
			
			// driver refresh
			
			driver.navigate().refresh();
		
		
			Thread.sleep(4000);
					
			// close the current browser session
			
			//driver.close();
			
			// driver quit will close all the browser sessions opened by the driver
			
			driver.quit();
			
			
			
			
			
		}catch 	(Exception e) {
			
			e.printStackTrace();
		
		

	}




	}

}
