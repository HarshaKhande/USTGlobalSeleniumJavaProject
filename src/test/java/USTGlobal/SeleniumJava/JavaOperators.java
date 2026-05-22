package USTGlobal.SeleniumJava;

public class JavaOperators {
	
	public static void main(String[] args) {
		
		// unary operators 
		
		// increment operator ++
		
		int a = 10;
		
		System.out.println(a++); // 10
		
		
		System.out.println(a); 
		
		// decrement operator --
		
		int b = 20;
		
		System.out.println(b--); // 20
		
		System.out.println(b);
		
		int c = 10;
		
		System.out.println(++c); // 11
		
		int d = 20;
		
		System.out.println(--d); // 19
		
		// arthimetric opeartors 
		
		int e = 10;
		
		int f = 20;
		
		System.out.println(e + f); // 30
		
			
		System.out.println(e - f); // -10
			
		System.out.println(e * f); // 200
			
		System.out.println(e / f); // 0
		
		// shift operators - right shift and left shift
		
		// right shift operator >>  divide the number by 2
		
		int g = 10;
		
		 System.out.println(g >> 2); //  10 / 2 ^ 2 = 10 / 4 = 2
		 
		 int h = 100;
		 
		 System.out.println(h >> 3); // 100 / 2 ^ 3 = 100 / 8 = 12
		 
		 // left shift operator <<  multiply the number by 2
		 
		 int i = 10;
		 
		 System.out.println(i << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
		 
		 // Relational operators
		 
		 int j = 10;	
		 
		 int k = 20;
		 
		 System.out.println(j > k); // false
		 
		 System.out.println(j < k); // true
		 
		 System.out.println(j >= k); // false
		 
		 System.out.println(j <= k); // true
		 
		 System.out.println(j == k); // false
		 
		 System.out.println(j != k); // true
		 	 
		
}

}
