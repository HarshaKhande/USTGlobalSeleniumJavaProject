package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
			
			// set up the edgedriver using WebDriverManager

					WebDriverManager.edgedriver().setup();	
					
					try {
						
						driver = new EdgeDriver();
					

						driver.get("https://jqueryui.com/checkboxradio/");
						
						// Maximize the browser window
						driver.manage().window().maximize();
						
						Thread.sleep(4000);
						
						// identify the web element 
						
					//	WebElement frame = driver.findElement(By.className("demo-frame"));
						
						driver.switchTo().frame(0);
						
						WebElement radio = driver.findElement(By.xpath("//label[normalize-space()='Paris']"));
						radio.click();	
						
						
						
					}catch 	(Exception e) {
						
						e.printStackTrace();
					
					

				}



		}
	
	

}
