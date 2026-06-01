package USTGlobal.SeleniumJava;

public class MethodOverdingChild extends MethodOverdingParent {
	

	
	public void sound(String name) {
		
		System.out.println(name);
		
		System.out.println("Dog barks");
		
	}
	

	public static void main(String[] args) {

		MethodOverdingChild md = new MethodOverdingChild();
	
		md.sound("Beagle");

	}

}

