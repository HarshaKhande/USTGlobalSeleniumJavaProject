package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();	
		
		try {
			
	
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	
			// Maximize the browser window
			driver.manage().window().maximize();
			
			// fetch the title of the web page and print it on the console
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			// get current URL and print it on the console
			
			
			String currentURL = driver.getCurrentUrl();
			
			String ExpcectedURL = "https://www.saucedemo.com/";
			
			System.out.println(currentURL);
			
			
			if(currentURL.equals(ExpcectedURL)) {
				
				System.out.println("The current URL is correct");
				
			}else {
				System.out.println("The current URL is incorrect");
			}
			
			
			// get Page source and print it on the console
			
			String pageSource = driver.getPageSource();
			
			System.out.println(pageSource);

		
			
			// close the current browser session
			
			//driver.close();
			
			
			
			
			
		}catch 	(Exception e) {
			
			e.printStackTrace();
		
		

	}




	}

}


