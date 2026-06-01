package USTGlobal.SeleniumJava;

public class SingleChild extends SingleParent{
	
	// child class data members
	
	static String  employeeBU = "HR";

	public static void main(String[] args) {
		
		
		SingleChild sc = new SingleChild();
		
		// data from parent class
		
		sc.employeedetails();
		
		// data from child class
		
		System.out.println(employeeBU);


	}

}
