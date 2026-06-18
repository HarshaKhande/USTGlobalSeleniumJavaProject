package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	

static WebDriver driver;
	
public static void main(String[] args) {
		
		// set up the edgedriver using WebDriverManager

				WebDriverManager.edgedriver().setup();	
				
				try {
					
					driver = new EdgeDriver();
					driver.get("https://rahulshettyacademy.com/AutomationPractice/");
					
					// Maximize the browser window
					driver.manage().window().maximize();
					
					Thread.sleep(8000);
					
					// identify the web element 
					
					
					// single element
					
					WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
					
					checkbox.click();
					
					checkbox.click();
					
					
					Thread.sleep(3000);
					
					// single element
					
					// radio button 
					
					WebElement radiobutton = driver.findElement(By.xpath("//input[@value = 'radio3']"));
					
					radiobutton.click();
					
					
					// multiple elements
					
					List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
					
					int count = checkboxes.size();
					
					System.out.println("Number of checkboxes: " + count);
					
					Thread.sleep(3000);
					
					// for loop to click on all the checkboxes
					
					for (int i = 0; i < count; i++) {
						
						checkboxes.get(i).click();
						
						String checkboxtext = checkboxes.get(i).getAttribute("value");
						
						System.out.println("Checkbox " + (i+1)  + ": " + checkboxtext);
						
						Thread.sleep(1000);
						
					}
						
					
					
				}catch 	(Exception e) {
					
					e.printStackTrace();
				
				

			}



	}


}
