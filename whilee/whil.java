package whilee;

public class whil {

	
	static int div(int n) {	
	int sum=0;
		int i=2;
		while (i<=n) {
			int a= n%i;
			if ( a==0) {
				
				sum =sum +1;
				n=n/i;
				 
				i++;
				
			
			 
			return sum;
		}}return 0;
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		int a=div(10);}}


