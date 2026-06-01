package USTGlobal.SeleniumJava;

public class Encapsulation {
	
	// encapsulation is the process of wrapping data members and member functions into a single unit called class 
	//and also hiding the data members from outside world by using access specifiers.
	
	// data members should be private to achieve encapsulation and we can access the data members by using getter and setter methods.
	
	
		protected double balance1;
		
		// getter method is used to get the value of private data member and setter method is used to set the value of private data member.
		
			public double getBalance() {
				return balance1;
			}

			public void setBalance(double balance) {
				
				// this key word is used to refer to the current class varible
				this.balance1 = balance;
			}

	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		
		// set the value of balance using setter method
		
		e.setBalance(10000);
			
		// get the value of balance using getter method
			
		System.out.println("Balance is " + e.getBalance());



	}

}
