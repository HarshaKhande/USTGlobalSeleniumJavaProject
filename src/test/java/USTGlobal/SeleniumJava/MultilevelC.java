package USTGlobal.SeleniumJava;

public class MultilevelC extends MultilevelB{
	
	String employeeLocation = "Bangalore";

	
	
	public static void main(String[] args) {
		
		MultilevelC mc = new MultilevelC();
		
		// data from parent class
		
		mc.employeedetails();
		
		// data from child class
		
		
		System.out.println(employeeBU);
		
		// data from 3rd child class
		
		System.out.println(mc.employeeLocation);
		
			

	}

}
