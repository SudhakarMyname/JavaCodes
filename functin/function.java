package functin;
import java.util.*;

public class function {

	 /* static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1));      */
         
  
public static void main(String[] args) {  
	
	
	Scanner x=new Scanner(System.in);
	int a=x.nextInt();
	int b= factorial(a);
System.out.println("Factorial of 5 is: "+factorial(5));  
}  




static int factorial(int n){      
    if (n == 1)      
      return 1;      
    else      
      return(n * factorial(n-1));      
}      

}  