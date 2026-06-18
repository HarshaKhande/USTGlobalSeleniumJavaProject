package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

				WebDriverManager.edgedriver().setup();	
				
				try {
					
					driver = new EdgeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
					// Maximize the browser window
					driver.manage().window().maximize();
					
					// implicit wait it is applicable to all the web elements in the web page and it will wait 
					//for the specified time before throwing NoSuchElementException
					
					driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
					
					// identify the web element for username and password and enter the credentials
					
					WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
					
					// explcit wait it is applicable to a specific web element and it will wait for the specified time until the condition is met before throwing NoSuchElementException
					 
					Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
					 wait.until(d -> username.isDisplayed());
					
					username.sendKeys("Admin");
					
					WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
					
					// Fluent wait it is applicable to a specific web element and it will wait for the specified time and it will check for the condition at regular intervals before throwing NoSuchElementException
					
					  Wait<WebDriver> wait1 =
						        new FluentWait<>(driver)
						            .withTimeout(Duration.ofSeconds(2))
						            .pollingEvery(Duration.ofMillis(300))
						            .ignoring(ElementNotInteractableException.class);

						    wait1.until(
						        d -> {
						        	password.sendKeys("Displayed");
						          return true;
						        });
					
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
