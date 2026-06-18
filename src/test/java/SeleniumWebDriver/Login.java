package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

static WebDriver driver;


	
	@Test(groups = {"Regression" , "smoke"})
	public void loginTest() {
		
		// set up the edgedriver using WebDriverManager

				WebDriverManager.edgedriver().setup();	
				
				try {
					
					driver = new EdgeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
					// Maximize the browser window
					driver.manage().window().maximize();
					
					Thread.sleep(8000);
					
					// identify the web element for username and password and enter the credentials
					
					WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
					
					username.sendKeys("Admin");
					
					WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
					
					password.sendKeys("admin123");
					
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
