package practice;
import java.util.*;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean isprime= true;
			Scanner x=new Scanner(System.in);
			
			int n=x.nextInt();
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					
					isprime=false;
					break;
				}
			}
			if(n<2) {
				isprime=false;
			}
			System.out.print("is prime "+isprime);
			
	}

}
