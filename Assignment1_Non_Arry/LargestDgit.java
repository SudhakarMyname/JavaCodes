package Assignment1_Non_Arry;
import java.util.*;

//Print Larget Digit

public class LargestDgit {

	public static void main(String[] args) {

		Scanner x= new Scanner(System.in);
		
		int a= x.nextInt();
		int max=0;
		
		
		while( a != 0) {
			
			int rem=a%10;
			
		 max= max > rem? max:rem;
			
			a=a/10;
		
			
		}
		System.out.println(max);
		
		
		

	}

}
