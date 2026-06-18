package SeleniumWebDriver;

import org.testng.annotations.Test;

public class TestcaseGrouping {
	
	
	
	@Test( groups = {"smoke"})
	public void test1() {
		
		System.out.println("This is test1");
		
	}
	
	@Test( groups = {"smoke"})
	public void test2() {
		
		System.out.println("This is test2");
		
	}
	
	
	@Test( groups = {"Regression" , "smoke"})
	public void test3() {
		
		System.out.println("This is test3");
		
	}
		
						
		public void test4() {
			
			System.out.println("This is test4");
			
		}
			
		
}
