package Assignment1_Non_Arry;
import java.util.*;

//HCF OF 2 NUM

public class HCF {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= x.nextInt();
		System.out.println("Enter 2nd number");
		int b= x.nextInt();
		int Min = a < b ? a : b ;
		int num = 0;
		for(int i=1; i<=Min; i++) {
		
		if(a % i == 0 && b % i == 0) {
			num = i;	
		}	
		}
		System.out.println("H.C.F is "+ num);	
	}

}
