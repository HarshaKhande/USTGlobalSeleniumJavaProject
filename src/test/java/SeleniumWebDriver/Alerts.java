package SeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
			
			// set up the edgedriver using WebDriverManager

					WebDriverManager.edgedriver().setup();	
					
					try {
						
						driver = new EdgeDriver();
					

						driver.get("https://the-internet.herokuapp.com/javascript_alerts");
						
						// Maximize the browser window
						driver.manage().window().maximize();
						
						Thread.sleep(4000);
						
						// identify the web element 
						
						WebElement infoalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
						
						infoalert.click();
						
						// pop up is opened and we need to switch the control to the pop up
						
						Alert alt = driver.switchTo().alert();
						
						// click on ok button on the pop up
						
						alt.accept();
						
						Thread.sleep(3000);
						
						// confirmational alert'
						
						WebElement confirmalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
						
						confirmalert.click();
						
						// click on cancel button on the pop up
							
						Alert alt1 = driver.switchTo().alert();
						
						// cilck on cancel button on the pop up
						
						alt1.dismiss();
						
						Thread.sleep(3000);
						
						// prompt alert to input text inside the alert
						
						WebElement promptalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
						
						promptalert.click();
						
						Alert alt2 = driver.switchTo().alert();
						
						// send some text to the prompt alert
						
						alt2.sendKeys("Selenium WebDriver");	
						
						// click on ok button on the pop up
						
						alt2.accept();
						
										
						
					}catch 	(Exception e) {
						
						e.printStackTrace();
					
					

				}



		}

}
