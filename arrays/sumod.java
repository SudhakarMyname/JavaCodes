package arrays;
import java.util.*;
public class sumod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		
		int[]a=new int [10];int sum=0;
		for (int i=0; i<10;i++) {
			
			a[i]=x.nextInt();
			int b=a[i]%2;
			if (b==1) {
				sum=sum+a[i];
			}
			
		
				 
			 }
			
			
		System.out.println(sum);	
				
			}
		
		
		
			
		}
	
	

