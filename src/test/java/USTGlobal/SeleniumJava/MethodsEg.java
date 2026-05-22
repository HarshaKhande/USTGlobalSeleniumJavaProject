package USTGlobal.SeleniumJava;

public class MethodsEg {
	
	// methods with out return type 
	
	// void is method not returning any value 
	
	public void add() {
		
		int a = 10;
		
		int b = 20;
		
		int c = a + b;
		
		System.out.println("Addition is " + c);
		
	}
	
	// method returning value 
	
	public int add1() {
		
		int a = 10;
		
		int b = 20;
		
		int  c = a + b;
		
		return c;
		
		
	}
	
	// double 
	
	public double calarea() {
		
		int r = 10;
		
		double area = 3.14 * r * r;
		
		return area;
		
		
	}
	
	
	
	
	// main  method
	public static  void   main(String[] args) {
		
		// create  the object of the class 
		
		MethodsEg m =  new MethodsEg();
		
		m.add();
		
		int result = m.add1();
		
		System.out.println("Addition is " + result);
		
		double area = m.calarea();
		
		System.out.println("Area of circle is " + area);
		
		
		


	}

}
