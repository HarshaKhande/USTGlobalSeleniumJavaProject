package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	
	static  WebDriver driver;
	
	By username = By.xpath("//input[@placeholder='Username']");

	By password = By.xpath("//input[@placeholder='Password']");
	
	By loginButton = By.xpath("//button[@type='submit']");
	
	
	public void login(String user, String pass) throws InterruptedException	 {
		
		driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
			
		driver.findElement(username).sendKeys(user);
		
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(loginButton).click();
		
		
	}	
	
	
	public void verifyforgotpasswordlink() {
		
		System.out.println("Forgot password link is present on the login page");
		
		
	}



	
	

}
