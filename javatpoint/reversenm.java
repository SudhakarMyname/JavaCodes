package javatpoint;
import java.util.*;

public class reversenm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int j=a;
		while(j!=0) {
			int sum=0;
			sum= j%10;
		System.out.print(sum);
		 j=j/10;
		}
	

	}

}
