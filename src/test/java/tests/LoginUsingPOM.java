package tests;




import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginUsingPOM {
	
	
	
	@Test
	public void loginTest() {
	
	LoginPage page = new LoginPage();
	
	
	try {
		
		page.login("Admin", "admin123");
		page.verifyforgotpasswordlink();

		
	} catch (Exception e) {


		e.printStackTrace();
	}

}

}
