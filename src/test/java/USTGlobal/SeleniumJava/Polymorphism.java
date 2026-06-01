package USTGlobal.SeleniumJava;

public class Polymorphism {
	
	// method overloading - compile time polymorphism
	
	// method name should be same 
	
	
	// change in number of parameters 2 3 4 parameters
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	public void add(int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
	public void add(int a, int b, int c, int d) {
		
		System.out.println(a+b+c+d);
		
	}
	
	// different parameters double , short , long and  int
	
	
	public void add(double a, double b) {
		
		System.out.println(a+b);
		
	}
	

	public void add(short a, short  b, short c) {
		
		System.out.println(a+b+c);
		
	}
	
	

	public void add(long a, long  b, long c , long d) {
		
		System.out.println(a+b+c+d);
		
	}
	

	
	public void add(double a, double b , double c) {
		
		System.out.println(a+b+c);
		
	}
	
	

	public static void main(String[] args) {

		Polymorphism p = new Polymorphism();
		
		p.add(10, 20);
		
		p.add(10, 20, 30);
		
		p.add(10, 20, 30, 40);
		
		p.add(10.5, 20.5);
		
		p.add((short)10, (short)20, (short)30);
		
		p.add(10000000000l, 20000000000l, 30000000000l , 40000000000l);
		
		p.add(10.5, 20.5 , 30.5);

	}

}
