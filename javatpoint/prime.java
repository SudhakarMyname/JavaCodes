package javatpoint;
import java.util.*;


public class prime {
	public static void main(String[] args) {
	Scanner x=new Scanner (System.in);
	int a=x.nextInt();	
		
		
		int b=a%2;
		if (a==2) {
			System.out.println("yes it is prime");
			
		}
		else if (a==1 || a==0) {
			System.out.println("no it is not");
		}
		else if (a%2==1) {
			System.out.println("yes it is prime");
		}
		

	}

}
