package Assignment1_Non_Arry;
import java.util.*;

//LCM OF 2 NUM

public class LCM {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter first num");
		int a= x.nextInt();
		System.out.println("Enter second num");
		int b=x.nextInt();
		int Multiply = a * b ;
		int Min=a<b?a:b;
		int num=0;
		for(int i=1 ; i <= Min ; i++) {
			
			if(a%i==0 && b%i==0) {
				
				num=i;
				
			}
		}
		System.out.println("L.C.M is "+Multiply/num);
		
		
		
		
	}

}
