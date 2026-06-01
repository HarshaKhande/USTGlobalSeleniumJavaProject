package USTGlobal.SeleniumJava;

public class Dog  extends Animal {
	
	void bark() {
		
		System.out.println("Barking");
		
	}
	
public static void main(String[] args) {
		
		
	Dog d = new Dog();
		
		// data from parent class
		
		d.eat();
		
		// data from child class
		

		d.bark();


	}


}
