package USTGlobal.SeleniumJava;

public class WhileDoWhileLoop {

	public static void main(String[] args) {

		int i = 1;
		
		while (i <= 10) {
			
			System.out.println(i);
			
			i++;
		}
		
	
	
	
	// do while loop will execute the block of code at least once even if the condition is false
		
		int j = 15;
		
		do {
			
			System.out.println(j);
			
			j++;
			
		} while (j <= 10);


	
	
	// continue statement is used to skip the current iteration and move to the next iteration
	
	
	for (int k = 1; k <= 10; k++) {
		
		if (k==5) {
			
			continue;
		}
		
		if (k == 3) {
			
			break; // will skip the current iteration and move to the next iteration
			
		}
		
		System.out.println(k);
		
	}

}

}
