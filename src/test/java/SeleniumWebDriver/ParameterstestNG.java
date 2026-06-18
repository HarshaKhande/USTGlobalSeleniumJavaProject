package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class ParameterstestNG {
	
	static WebDriver driver;
	
	@Test
	@Parameters({"username" , "password"})
	public void loginTest(String username , String password) {
		
		WebDriverManager.edgedriver().setup();	
		
		try {
			
			driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			// Maximize the browser window
			driver.manage().window().maximize();
			
			Thread.sleep(8000);
			
			// identify the web element for username and password and enter the credentials
			
			WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			
			Username.sendKeys(username);
			
			WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			
			Password.sendKeys(password);
			
			// click on the login button
			
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			loginButton.click();
			
			// close the current browser session
			
			//	driver.close();
			
			Thread.sleep(4000);
			
			// fetch the title of the web page and print it on the console
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			String ExpcectedTitle = "OrangeHRM";
			
			
			if(title.equals(ExpcectedTitle)) {
				
				System.out.println("The title is correct");
				
			}else {
				System.out.println("The title  is incorrect");
			}
			
			
			
			
			
			
			
		}catch 	(Exception e) {
			
			e.printStackTrace();
		
		

	}
	}
	
	
	

}
