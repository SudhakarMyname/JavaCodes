package practice;
import java.util.*;

public class trainglegapinside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int n= x.nextInt();
		System.out.println("*");
		for(int i=1;i<n-1;i++) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=n;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
		}
	}

}
