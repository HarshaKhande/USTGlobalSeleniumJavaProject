package USTGlobal.SeleniumJava;

public class StringsEg {

	public static void main(String[] args) {
		
		// string is a class in java and it is used to store the sequence of characters
		
		// string is immutable in java which means once the string is created it cannot be changed
		
		
		String s1 = "hello world";
		
		System.out.println(s1);
		
		String s2 = new String("hello world");
		
		System.out.println(s2);
		
		char[] ch = {'h','e','l','l','o'};
		
		String s3 = new String(ch);	
		
		System.out.println(s3);
		
		
		// string methods			
		
		String s4 = "hello world";
		
		String s5 = "NEWDELHI";
		
		System.out.println(s4.length());
		
		System.out.println(s4.toUpperCase());
		
		System.out.println(s5.toLowerCase());
		
		//	 to compare two strings we can use equals method
		
		System.out.println(s4.equals(s5)); // false 
		
		// equalsIgnoreCase method is used to compare two strings ignoring the case
		
		System.out.println(s4.equalsIgnoreCase(s5)); // false
				
		// concatenation of strings
		
		System.out.println(s4.concat(s5)); // hello worldNEWDELHI
		
		// substring method is used to get the substring of a string
		
		System.out.println(s4.substring(0, 5)); // hello
		
									
		System.out.println(s4.substring(1, 3)); // el
		
		// replace
		
		System.out.println(s4.replace('o', 'a')); // hella warld
		
		// is empty 
		
		System.out.println(s4.isEmpty()); // false
		
		// contains 
		
		System.out.println(s4.contains("world")); // true
		
		// split method is used to split the string into an array of strings based on the given delimiter
		
		String text = "java is a programming language";
		
		String[] result = text.split(" ");
		
		
		for (String str : result) {
			
			System.out.println(str + ",");
		}
					
		
		
		

		

	}

}
