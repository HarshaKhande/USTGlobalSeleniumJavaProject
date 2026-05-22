package USTGlobal.SeleniumJava;

public class MethodsWithParams {
	
	
	// methods with parameters 
	
	
	public void add (int a,int b ){
		
		int c = a + b;
		
		System.out.println("Addition is " + c);
		
	}


	public static void main(String[] args) {
		
	
		MethodsWithParams m = new MethodsWithParams();
		
		m.add(20, 30);	
		
}
	
}
