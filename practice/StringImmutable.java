package practice;

public class StringImmutable {

	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = str1;  // Assigning str1 to str2

	        System.out.println("Before modification:");
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);

	        // Modifying str1
	        str1 = str1 + " World";
	        
	       boolean check = str1==str2;
	       System.out.println(check);
	        
	        System.out.println("\nAfter modification:");
	        System.out.println("str1: " + str1);  // Modified string
	        System.out.println("str2: " + str2);  // Unchanged string
	    }
	}


