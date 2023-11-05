package Assignment1_Non_Arry;
import java.util.*;

// sum of both nos. digits

public class SumOfDigits {

	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=x.nextInt();
		System.out.println("Enter Second Number");
		int b=x.nextInt();
		
		while(a != 0) {
			if(a < 10 && a > 0) {
				break;
			}
		int	div = a/10;
		
			int rem= a%10;
			
			a = div + rem;
		
		}
		while(b != 0) {
			if(b < 10 && b > 0) {
				break;}
			int div = b/10;
			int rem=b%10;
			b = div + rem;	
			
		}
		System.out.println(a+""+b);
	}

}
