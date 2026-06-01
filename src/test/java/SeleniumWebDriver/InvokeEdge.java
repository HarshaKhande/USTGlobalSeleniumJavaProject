package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

				WebDriverManager.edgedriver().setup();	
				
				try {
					
					driver = new EdgeDriver();
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
