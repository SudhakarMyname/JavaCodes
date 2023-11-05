package practice;
import java.util.*;

public class booleanmatri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner x=new Scanner(System.in);
       int T=x.nextInt();
      
       while(T-->0) {
    	   int m=x.nextInt();
    	   int n=x.nextInt();
    	     x.nextLine();
    	  for(int i=0;i<m;i++) {
    		  boolean is_zero=true;
    		  String str=x.nextLine();
    		  if(str.contains("1")) {
    			  is_zero=false;
    		  }
    		  if(is_zero) {
    			  System.out.print(str);
    		  }
    		  else {
    			  for(int j=0;j<n;j++) {
    				  System.out.print("1"+" ");
    			  }
    		  }
    		  System.out.println();
    		  
    		  
    	  }
    	   
       }

		
		
		
		
		
		
	}

}
