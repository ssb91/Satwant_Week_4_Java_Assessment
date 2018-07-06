package Models;
import java.util.Math;

public class Assessment {


//add two previous numbers up to the nth term, initial values are n(0) = 0 and n(1) = 1
	
	public static int fibonacci(int n){      
		
		if (n == 0) return 0;
		if (n == 1) return 1;		
		else return (fibonacci(n - 2) + fibonacci(n - 1));      

    }
	
//select n characters from beginning of string, and end of string, put them together
	
	
	public static String nTwice(String A, int n) {
		
	    	if (A.length() >= n) {return A.substring(0, n) + A.substring(A.length() - n, A.length());}      
	    	else {return A;}

	}
	
//absolute difference between a and b should equal between b and c, using absolute value/modulus
	
	public static boolean evenlySpaced(int a, int b, int c) {
		
		if ( Math.abs(a-b) == Math.abs(b-c)) {return true;}
		else return false;
		
	}
	
//compare last two characters of string with "ly"
	
	public static boolean endsly(String A) {
		
    	if (A.substring(A.length()-2,A.length()).equals("ly")) {return true;}      
    	else {return false;}
    	
	}

	
//doubling n is equivalent to adding 2 repeatedly from 0 (n times) up to the nth term, 
//i.e. keep adding 2 on to the previous term
	
	public static int bunnyEars(int n) {
		
		if (n == 0) return 0;
    	else return bunnyEars(n - 1) + 2;
    	
	}
	
	
/*	

//run a loop through string, if any two adjacent are equal replace both with the character

    public static String stringClean(String A) {
    		
        for (int i = 0; i < A.length(); i++) {
        	if (A.charAt(i) == A.charAt(i+1)) {return charAt(i);}      
        }

        else {return A;}
        	
}

*/
	
/*

//retrieve each character, add it immediately after, or replace it with the same character twice
//use recursion to 
 
	
		public static String doubleChar(String A) {
			
//			for (int i = 0; i <= A.length(); i++) { A.replace(A.charAt(i), A.charAt(i)A.charAt(i));}				
					
		}

*/
	
	
//for superblock find max of block (substring) lengths, each block is the same char, 
//use a loop to check if adjacent characters are the same

/*		
	
	public static String superblock(String A) {
				
//		return Math.max(A.length(A.substring()); }
					
	}

*/

/*		

//for sandwich compare substrings with bread, extract substring between them

	public static String getSandwich(String A) {
				
//		if (A.equals("bread"); }
					
	}

*/
	
	
	public static void main(String args[]) {
	
//		System.out.println(doubleChar("hydromagnetic"));
		
		System.out.println("fibonacci: " + fibonacci(5));

		System.out.println("nTwice: " + nTwice("hydromagnetic",5));
		
		System.out.println("endsly: " + endsly("electrically"));
		System.out.println("endsly: " + endsly("electrical"));
		
		System.out.println("evenlySpaced: " + evenlySpaced(9,18,27));
		System.out.println("evenlySpaced: " + evenlySpaced(8,3,25));

		System.out.println("bunnyEars: " + bunnyEars(9));		
		
}

}