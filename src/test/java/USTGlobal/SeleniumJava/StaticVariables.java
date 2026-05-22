package USTGlobal.SeleniumJava;

public class StaticVariables {
	
	// static variables scope is within the class and object
		
		static String employeeBU = "HR";
		
	
		
		public static void employeedetails() {
			
			// local variables
			
			String employeeName = "Ravi";
			
			int employeeId = 1234;
			
			System.out.println(employeeName);
			
			System.out.println(employeeId);
			
			System.out.println(employeeBU);
			
			
			
		}

	public static void main(String[] args) {
		
		
		
		employeedetails();
		
		System.out.println(employeeBU);



	}

}
