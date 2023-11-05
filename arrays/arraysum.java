package arrays;
import java.util.*;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new int[5];int sum=0;
		Scanner x=new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			a[i]=x.nextInt();
			
			sum=sum+a[i];}
		
	System.out.println(sum);
		}

}
