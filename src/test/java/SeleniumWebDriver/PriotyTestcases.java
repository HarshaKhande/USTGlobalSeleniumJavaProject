package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriotyTestcases {
	
	static WebDriver driver;

	
	@Test(priority = 0)
	public void test1() {
		
		WebDriverManager.edgedriver().setup();	
		
	
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// close the current browser session
			
		//	driver.close();



	}
	
	@Test(enabled = false)
	public void test4() {
		
		WebDriverManager.edgedriver().setup();	
		
	
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// close the current browser session
			
		//	driver.close();



	}
	
	@Test(priority = 1)
	public void test2() {
		
		WebDriverManager.edgedriver().setup();	
		
	
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// close the current browser session
			
		//	driver.close();



	}
	
	
	@Test(priority = 2)
	public void test3() {
		
		WebDriverManager.edgedriver().setup();	
		
	
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// close the current browser session
			
		//	driver.close();



	}
	
}
