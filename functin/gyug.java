package functin;
import java.util.*;

public class gyug {

	public static void main(String[] args) {
		//public static void main(String[] args) throws Exception {
		  int[] values = {1,  2, 3};
	        int smallest = values[0];
	     System.out.println(smallest);
	        int largest  = values[0];
	      
	        for (int n = 0; n < values.length; ++n) {
	       
	            int value = values[n];
	        
	            if (value < smallest) {
	           //System.out.println(smallest);
	                smallest = value;
	         //System.out.println(smallest);
	            } else if (value > largest) {
	            	
	           
	            	
	                largest = value;
	           
	            }
	        }
	       System.out.println(smallest + ", " + largest); // 1, 5
	    }
	
		                      
}